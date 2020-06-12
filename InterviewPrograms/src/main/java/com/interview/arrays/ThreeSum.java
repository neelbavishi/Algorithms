package com.interview.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static List<List<Integer>> get3Sum(int[] nums)
	{
		Set<List<Integer>> set = new HashSet<>();
		Arrays.sort(nums);
		
		for(int i=0; i<(nums.length-2); i++)
		{
			int j = i+1;
			int k = nums.length-1;
			
			while(j<k)
			{
				int res = nums[i] + nums[j] + nums[k];
				if(res == 0)
				{
					if(!set.contains(Arrays.asList(nums[i], nums[j], nums[k])))
					{
						set.add(Arrays.asList(nums[i], nums[j], nums[k]));
					}	
				}
				
				if(res > 0)
				{
					k--;
				}
				else
				{
					j++;
				}
			}
		}
		
		return new ArrayList(set);
	}
	
	public static void main(String args[])
	{
		int arr[] = { -1,0,1,2,-1,-4 };
		List<List<Integer>> res = get3Sum(arr);
		System.out.println("Three sum lists: " + res);
	}
}
