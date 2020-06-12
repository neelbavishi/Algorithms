package com.interview.arrays.search;

public class FirstLastPosition {

	public int[] searchRange(int[] nums, int target) {
		int[] res = new int[2];
		int left = 0;
		int right = nums.length - 1;

		int leftIndex = -1;
		int rightIndex = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (target == nums[mid]) {
				leftIndex = mid;
			}

			if (nums[mid] >= target) {
				right = mid - 1;
			}

			else {
				left = mid + 1;
			}
		}

		if (leftIndex == -1) {
			res[0] = -1;
			res[1] = -1;

			return res;
		}

		left = leftIndex;
		right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (target == nums[mid]) {
				rightIndex = mid;
			}

			if (nums[mid] <= target) {
				left = mid + 1;
			}

			else {
				right = mid - 1;
			}
		}

		res[0] = leftIndex;
		res[1] = rightIndex;
		return res;
	}
}
