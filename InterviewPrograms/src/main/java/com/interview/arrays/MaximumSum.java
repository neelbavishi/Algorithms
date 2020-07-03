package com.interview.arrays;

public class MaximumSum {
	public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = sum;
        
        for(int i=1; i<nums.length; i++) {
            sum += nums[i];
            sum = Math.max(sum, nums[i]);  
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
	
	public static void main(String args[]) {
		int arr[] = { -1, 0, 1, 2, -1, -4 };
		int res = maxSubArray(arr);
		System.out.println("Max SubArray sum: " + res);
	}
}
