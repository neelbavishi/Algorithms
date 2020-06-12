package com.interview.datastructures.Tree;

public class SortedArrayToBST {
	public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums, 0, nums.length - 1);
    }
    
    private TreeNode toBST(int[] nums, int from, int to) {
        if (from > to) {
            return null;
        }
        
        int mid = from + (to - from) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = toBST(nums, from, mid - 1);
        node.right = toBST(nums, mid + 1, to);
        
        return node;
    }
}
