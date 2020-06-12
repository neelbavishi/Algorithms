package com.interview.arrays;

public class SmallestSubArraySum {

	public static int getSmallestSubArraySum(int nums[], int k)
	{
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int start = 0;
		
		for(int i=0; i<nums.length; i++)
		{
			sum += nums[i];
			while(sum>=k) {
			    min = Math.min(min, i-start+1);
			    sum-=nums[start];
			    start++;
			}
		}
		
		return min == Integer.MAX_VALUE ? 0:min;
	}
	
	public static void main(String args[]) {
		int arr[] = {2,3,1,2,4,3};
		int res = getSmallestSubArraySum(arr, 7);
		System.out.println("Min SubArray sum: " + res);
	}
}
