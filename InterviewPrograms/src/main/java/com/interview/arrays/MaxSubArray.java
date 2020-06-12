package com.interview.arrays;

public class MaxSubArray {

	public static int getMaxContiguousSubArraySum(int nums[]) {
		int max = Integer.MIN_VALUE;
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

			max = Math.max(sum, max);

			if (sum < 0) {
				sum = 0;
			}
		}

		return max;
	}
	
	public static int getMaxContiguousSubArraySumWithSizeK(int nums[], int k) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int start = 0;

		for (int end = 0; end < nums.length; end++) {
			sum += nums[end];
			if (end-start == k-1) {
				max = Math.max(sum, max);
				sum -= nums[start];
				start++;
			}
		}

		return max;
	}

	public static void main(String args[]) {
		int arr[] = { -1, 0, 1, 2, -1, -4 };
		int res = getMaxContiguousSubArraySum(arr);
		System.out.println("Max SubArray sum: " + res);
		int res2 = getMaxContiguousSubArraySumWithSizeK(arr, 4);
		System.out.println("MaxContiguousSubArraySumWithSizeK: " + res2);
	}
}
