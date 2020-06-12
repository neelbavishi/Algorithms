package com.interview.arrays;

import java.util.PriorityQueue;

public class KthLargest {

	// min heap solution with complexity O(nLogk)
	public static int findKthLargestNumber(int nums[], int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0; i<nums.length; i++)
		{
			if(pq.size() < k)
			{
				pq.add(nums[i]);
			}
			else
			{
				if(pq.peek() < nums[i])
				{
					pq.poll();
					pq.add(nums[i]);
				}
			}
		}
		return pq.peek();
	}
	
	public static void main(String args[])
	{
		int[] nums = {10, 5, 11, 25, 17, 19, 35, 22, 15};
		System.out.println(findKthLargestNumber(nums,3));
	}
}
