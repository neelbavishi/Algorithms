package com.interview.arrays.xor;

class SingleNonDuplicate {
	public static int getSingle(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		return (result >= 0 ? result : -1);
	}

	// Driver method
	public static void main(String args[]) {
		int arr[] = { 3, 3, 2, 2, 4 };
		System.out.println("The element with single occurrence is " + getSingle(arr));
	}
}
