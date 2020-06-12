package com.interview.arrays;

public class ArrayOfProductExceptSelf {

	public static int[] getArrayOfProductExceptSelf(int arr[])
	{
		int res[] = new int[arr.length];
		int left[] = new int[arr.length];
		int right[] = new int[arr.length];
		
		int n = arr.length;
		
		left[0] = 1;
		right[n-1] = 1;
		
		for(int i=1; i<n; i++)
		{
			left[i] = arr[i-1] * left[i-1];
		}
		
		for(int i=n-2; i>=0; i--)
		{
			right[i] = arr[i+1] * right[i+1];
		}
		
		for(int i=0; i<n; i++)
		{
			res[i] = left[i]*right[i];
		}
		
		return res;
	}
	
	public static void main(String args[]) {
		int arr[] = {1,2,3,4};
		int[] res = getArrayOfProductExceptSelf(arr);
		System.out.println("Product of Array except 1: " + res[0]);
	}
}
