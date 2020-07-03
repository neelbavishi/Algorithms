package com.interview.random;

public class ClimbingStairs {
	public int climbStairs(int n) {
        if(n<0)
            return 0;
        if(n==0 || n==1)
            return 1;
        if(n==2)
            return 2;
        // create an array of n+1 size for storing solutions to the sub-problems
		int[] lookup = new int[n + 1];

		// base case: 1 way (with no steps)
		lookup[0] = 1;

		// There is only 1 way to reach the 1st stair
		lookup[1] = 1;

		// There are 2 ways to reach the 2nd stair
		lookup[2] = 2;

		// Fill the lookup table in bottom-up manner
		for (int i = 3; i <= n; i++) {
			lookup[i] = lookup[i - 1] + lookup[i - 2];
		}

		return lookup[n];
    }
}
