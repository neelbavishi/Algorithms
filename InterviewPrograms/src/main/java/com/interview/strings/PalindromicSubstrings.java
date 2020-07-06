package com.interview.strings;

public class PalindromicSubstrings {
	public int countSubstrings(String s) {
        int n = s.length();
        
        int ans = 0;
        for(int center = 0; center <= 2 * n - 1; ++center){
            int start = center / 2;
            int end = start + center % 2;
            while(start >= 0 && end < n && s.charAt(start) == s.charAt(end)){
                ans++;
                start--;
                end++;
            }
        }
        
        return ans;
    }
}
