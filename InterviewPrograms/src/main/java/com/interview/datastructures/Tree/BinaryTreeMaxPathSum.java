package com.interview.datastructures.Tree;

public class BinaryTreeMaxPathSum {
	int result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathSum(root, 0);
        return result;
    }
    
    public int maxPathSum(TreeNode node, int curr) {
        if(node == null)
            return 0;
        int left = maxPathSum(node.left, curr);
        int right = maxPathSum(node.right, curr);   
        int max = Math.max(Math.max(left,right) + node.val, node.val);
        curr = Math.max(node.val + left + right, max);
        result = Math.max(result,curr);
        
        return max;
    }
}
