package com.interview.datastructures.Tree;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberDistinctNodesBinaryTreePath {
	public static int getDistinctCnt(Node n) {
		Map<Integer, Node> t = new HashMap<>();
		getMax(n, t);
		return t.values().size();
	}

	public static void getMax(Node n, Map<Integer, Node> t) {
		if (n != null) {
			if (!t.containsKey(n.data)) {
				t.put(n.data, n);
			}
			getMax(n.right, t);
			getMax(n.left, t);
		}
	}


	public static int rootToLeafWithMaxDistinctNodes(Node node, HashMap<Integer, Integer> m) {
		if (node == null)
			return m.size();

        // put this node into hash 
		if (m.containsKey(node.data)) {
			m.put(node.data, m.get(node.data) + 1);
		} else {
			m.put(node.data, 1);
		}

		int max_path = Math.max(rootToLeafWithMaxDistinctNodes(node.left, m), rootToLeafWithMaxDistinctNodes(node.right, m));

        // remove current node from path "hash" 
		if (m.containsKey(node.data)) {
			m.put(node.data, m.get(node.data) - 1);
		}

        // if we reached a condition where all duplicate value 
        // of current node is deleted 
		if (m.get(node.data) == 0)
			m.remove(node.data);

		return max_path;
	}

    //A utility function to find long unique value path 
	public static int rootToLeafWithMaxDistinctNodes(Node node) {
		if (node == null)
			return 0;

        // hash that store all node value 
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        // return max length unique value path 
		return rootToLeafWithMaxDistinctNodes(node, hash);
	}

	public static void main(String[] args) {
		// Create binary tree shown in above figure
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);
		root.right.right.right = new Node(9);
		root.right.right.left = new Node(4);
		root.right.right.left.right = new Node(7);
		root.right.right.left.left = new Node(11);

		System.out.println(getDistinctCnt(root));
	}
}
