package com.interview.arrays;

public class RotatedSortedArray {

	public static int findStartOfRotatedSortedArray(int nums[])
	{
		int start = 0;
		int end = nums.length-1;
		int mid = start + (end-start)/2;
		
		while(start <= end)
		{
			if(nums[mid] > nums[nums.length-1])
			{
				start = mid+1;
			}
			else if(nums[mid] < nums[nums.length-1])
			{
				end = mid-1;
			}
			else
			{
				break;
			}
			mid = start + (end-start)/2;
		}
		
		return mid;
	}
	
	public static int searchElementInRotatedSortedArray(int nums[], int k)
	{
		int start = 0;
		int end = nums.length-1;
		
		while(start <= end)
		{
			int mid = start + (end-start)/2;
			if(nums[mid] == k)
			{
				return mid;
			}
			if(nums[mid] <= nums[end])
			{
				if(k>nums[mid] && k<=nums[end])
				{
					start = mid+1;
				}
				else
				{
					end = mid-1;
				}
			}
			else
			{
				if(k<=nums[mid] && k>nums[start])
				{
					end = mid-1;
				}
				else
				{
					start = mid+1;
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String args[])
	{
		int nums[] = {7,8,9,10,1,2,3,4,5,6};
		int pivot = findStartOfRotatedSortedArray(nums);
		System.out.println("start of rotation: " + pivot);
		System.out.println("count of rotation: " + pivot);
		System.out.println(searchElementInRotatedSortedArray(nums, 7));
	}
}
