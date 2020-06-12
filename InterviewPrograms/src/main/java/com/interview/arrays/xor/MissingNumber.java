package com.interview.arrays.xor;

// Find missing number in an array

public class MissingNumber {

	public static int getMissingNumber(int nums[])
	{
		int result = nums.length;
		for(int i=0; i< nums.length; i++)
		{
			result ^= i^nums[i];
		}
		
		return result;
	}
	
	public static void main(String arga[])
	{
		int arr[] = {3,0,1};
		int missing = getMissingNumber(arr);
		System.out.println(missing);
	}
}
