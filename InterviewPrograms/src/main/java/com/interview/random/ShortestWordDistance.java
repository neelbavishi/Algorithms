package com.interview.random;

public class ShortestWordDistance {
	public int shortestDistance(String[] words, String word1, String word2) {
        int pointer1=-1;
        int pointer2=-1;
        
        int shortestDistance = Integer.MAX_VALUE;
        
        for(int i=0; i<words.length; i++)
        {
            if(words[i].equals(word1))
            {
                pointer1 = i;
            }
            else if(words[i].equals(word2))
            {
                pointer2 = i;
            }
            if(pointer1>-1 && pointer2>-1)
            {
                shortestDistance = Math.min(shortestDistance, Math.abs(pointer2-pointer1));
            }          
        }
        
        return shortestDistance;
    }
}
