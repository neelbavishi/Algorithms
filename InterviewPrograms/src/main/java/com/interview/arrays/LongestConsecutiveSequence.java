package com.interview.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static int longestConsecutive(int[] nums)
	{
		Set<Integer> numSet = new HashSet<>();
		for(int num : nums)
		{
			numSet.add(num);
		}
		
		int max = 1;
		for(int num : nums)
		{
			if(numSet.contains(num-1))
				continue;
			
			int curMax = 1;
			while(numSet.contains(num+1))
			{
				num++;
				curMax++;
			}
			max = Math.max(max, curMax);
		}
		
		return max;
	}
	
	public static void main(String args[])
	{
		int nums[] = {100, 4, 200, 1, 3, 2};
		System.out.println(longestConsecutive(nums));
	}
}
