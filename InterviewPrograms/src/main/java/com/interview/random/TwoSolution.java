package com.interview.random;

import java.util.HashMap;
import java.util.Map;

public class TwoSolution {

	public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> sumMap = new HashMap<Integer,Integer>();
        int[] resArray = new int[2];
        for(int i=0; i<nums.length; i++)
        {
            sumMap.put(nums[i],i);
        }
        
        for(int i=0; i<nums.length; i++)
        {
            int rem = target - nums[i];
            
            if(sumMap.containsKey(rem) && sumMap.get(rem) != i)
            {
                int otherNum = sumMap.get(rem);
                resArray[0] = i;
                resArray[1] = otherNum;
                return resArray;
            }
        }
        
        return null;
    }
}
