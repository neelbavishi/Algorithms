package com.interview.datastructures.Tree;

class TreeNode {

	int val;
	TreeNode left, right;

	TreeNode(int item) {
		val = item;
		left = right = null;
	}
}

class Solution {
    Integer res; 
    Integer prev;
        
    public int minDiffInBST(TreeNode root) {
        res = Integer.MAX_VALUE;
        prev = null;
        inorder(root);
        return res;
    }
    
    public void inorder(TreeNode node) {
        if(node == null) return;
        inorder(node.left);
        if(prev !=  null){
            res = Math.min(res, node.val - prev);
        }
        prev = node.val;
        inorder(node.right);
    }
}
