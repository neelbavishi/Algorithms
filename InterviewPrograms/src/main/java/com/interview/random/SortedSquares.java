package com.interview.random;

public class SortedSquares {

	public int[] sortedSquaresOut(int[] A) {
        if(A == null || A.length == 0) return new int[0];
        
        int ans[] = new int[A.length];
        
        int l = 0;
        int r = A.length-1;
        int pos = r;
        
        while(l<=r)
        {
            if(Math.abs(A[l]) < Math.abs(A[r]))
            {
                ans[pos--] = A[r] * A[r];
                r--;
            }
            else
            {
                ans[pos--] = A[l] * A[l];
                l++;
            }
        }
        return ans;
    }
}
