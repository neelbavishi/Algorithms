package com.interview.datastructures.Tree;

import java.util.HashSet;
import java.util.Set;

public class GraphToTree {
	public boolean validTree(int n, int[][] edges) {
        Set<Integer>[] graph = new HashSet[n];
        for (int i = 0; i < n; i++) graph[i] = new HashSet<>();
        // construc graph
        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        int[] visited = new int[n];
        // dfs searching circle
        if (dfs(graph, visited, 0)) return false;
        // check if all nodes are connected
        for (int i : visited) {
            if (i != 1) return false;
        }
        return true;
    }
    private boolean dfs(Set<Integer>[] graph, int[] visited, int n) {
        if (visited[n] == 1) return true;
        visited[n] = 1;
        for (int next : graph[n]) {
            // avoid returning back to previous node
            graph[next].remove(n);
            if (dfs(graph, visited, next)) return true;
        }
        return false;
    }
}
