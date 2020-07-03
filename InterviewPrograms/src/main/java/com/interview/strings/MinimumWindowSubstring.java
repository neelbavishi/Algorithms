package com.interview.strings;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
	public String minWindow(String s, String t) {
        int min = Integer.MAX_VALUE;
        int start = 0;
        int startIndex = 0;
        int matches = 0;
        Map<Character, Integer> freqs = getFrequencyMap(t);
        
        for(int end=0; end<s.length(); end++)
        {
            char c = s.charAt(end);
            if(freqs.containsKey(c))
            {
                freqs.put(c, freqs.getOrDefault(c,0)-1);
                if(freqs.get(c) >= 0)
                {
                    matches++;
                }
            }
            
            while(matches == t.length())
            {
                if(min > end-start+1)
                {
                    min = end-start+1;
                    startIndex = start;
                }
                
                char leftChar = s.charAt(start++);
                if(freqs.containsKey(leftChar)){
                    if(freqs.get(leftChar) == 0){
                        matches--;
                    }
                    freqs.put(leftChar, freqs.get(leftChar) + 1);
                }
            }
        }
        
        return min == Integer.MAX_VALUE ? "" : s.substring(startIndex, min+startIndex);
        
    }
    
    private Map<Character, Integer> getFrequencyMap(String str)
    {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c : str.toCharArray())
        {
            freqMap.put(c, freqMap.getOrDefault(c,0)+1);
        }
        
        return freqMap;
    }
}
