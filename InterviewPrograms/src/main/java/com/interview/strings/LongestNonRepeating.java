package com.interview.strings;

import java.util.HashSet;
import java.util.Set;

/*
 * The idea is use a hash set to track the longest substring without repeating characters so far, 
 * use a fast pointer j to see if character j is in the hash set or not, if not, great, 
 * add it to the hash set, move j forward and update the max length, otherwise, delete 
 * from the head by using a slow pointer i until we can put character j to the hash set.
 * */

public class LongestNonRepeating {
	public static int lengthOfLongestSubstring(String s) {
	    int i = 0, j = 0, max = 0;
	    Set<Character> set = new HashSet<Character>();
	    
	    while (j < s.length()) {
	        if (!set.contains(s.charAt(j))) {
	            set.add(s.charAt(j++));
	            max = Math.max(max, set.size());
	        } else {
	            set.remove(s.charAt(i++));
	        }
	    }
	    
	    return max;
	}
	
	public static void main(String args[])
	{
		String input = "abcabcbb";
		System.out.println("longest substring with repeating characters is : " + lengthOfLongestSubstring(input));
	}
}
