package com.interview.random;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, target, new ArrayList<Integer>(), 0);
        return result;
    }
    
    public void dfs(int[] candidates, int target, List<Integer> combinationList, int index)
    {
    	if(target == 0)
    	{
    		result.add(new ArrayList<>(combinationList));
    	}
    	
    	if(target < 0)
    	{
    		return;
    	}
    	
    	if(target > 0)
    	{
    		for(int i=index; i<candidates.length; i++)
    		{
    			combinationList.add(candidates[i]);
    			dfs(candidates, target-candidates[i], combinationList, i);
    			combinationList.remove(combinationList.size() - 1);
    		}
    	}
    }
    
    public static void main(String args[])
	{
		int[] input = {2,3,6,7};
		int target = 7;
		CombinationSum combinationSum = new CombinationSum();
		List<List<Integer>> result = combinationSum.combinationSum(input, target);
		System.out.println(result);
	}
}
