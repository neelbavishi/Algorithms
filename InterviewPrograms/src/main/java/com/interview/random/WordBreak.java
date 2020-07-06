package com.interview.random;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordBreak {
	public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] visited = new boolean[s.length()];
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        
        while(!queue.isEmpty()){
            int start = queue.poll();
            
            if(visited[start]) continue;
            
            for(int end = start + 1; end <= s.length(); end++){
                String word = s.substring(start,end);
                if(wordDict.contains(word)){
                    if(end == s.length()) return true;
                    queue.add(end);
                   
                }
            }
            visited[start] = true;
        }
        
        return false;
    }
	
	public static void main(String args[])
	{
		List<String> wordDict = new ArrayList<>();
		wordDict.add("leet");
		wordDict.add("code");
		String word = "leetcode";
		System.out.println(wordBreak(word, wordDict));
	}
}
