package com.interview.datastructures.Tree;

public class LowestCommonAncestor {

	public Node getLowestCommonAncestor(Node node, Node p, Node q) {
		if(node == null) {
			return node;
		}
		if(node == p || node == q) {
			return node;
		}
		Node lnode = getLowestCommonAncestor(node.left, p, q);
		Node rnode = getLowestCommonAncestor(node.right, p, q);
		
		if(lnode != null && rnode != null) {
			return node;
		}
		
		return (lnode==null?rnode:lnode);
	}
}
