package com.interview.datastructures.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph {
	HashMap<Integer, Node> map = new HashMap<>();

	public Node cloneGraph(Node node) {
		if (node == null)
			return null;
		Node newNode = new Node(node.val);
		map.put(node.val, newNode);
		for (Node nei : node.neighbors) {
			if (map.containsKey(nei.val)) {
				newNode.neighbors.add(map.get(nei.val));
			} else {
				Node curr = cloneGraph(nei);
				newNode.neighbors.add(curr);
			}
		}
		return newNode;
	}
	
	class Node {
	    public int val;
	    public List<Node> neighbors;
	    
	    public Node() {
	        val = 0;
	        neighbors = new ArrayList<Node>();
	    }
	    
	    public Node(int _val) {
	        val = _val;
	        neighbors = new ArrayList<Node>();
	    }
	    
	    public Node(int _val, ArrayList<Node> _neighbors) {
	        val = _val;
	        neighbors = _neighbors;
	    }
	}
}
