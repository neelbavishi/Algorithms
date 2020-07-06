package com.interview.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreqElements {
	public int[] topKFrequent(int[] nums, int k) {
        if(nums==null || nums.length==0){
            return null;
        }
        if(nums.length==1){
            return nums;
        }
        if(nums.length==k){
            return nums;
        }
        int res[] = new int[k];
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1, n2) -> freqMap.get(n2) - freqMap.get(n1));
        pq.addAll(freqMap.keySet());
        
        for(int i=0; i<k; i++)
        {
            res[i] = pq.poll();
        }
        
        return res;
    }
}
