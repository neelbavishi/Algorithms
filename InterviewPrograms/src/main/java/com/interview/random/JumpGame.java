package com.interview.random;

public class JumpGame {
	public static boolean canJump(int[] nums) {
        int lastPos = nums.length-1;
        for(int i=nums.length-2; i>=0; i--)
        {
            if(i+nums[i] >= lastPos)
            {
                lastPos = i;
            }
        }
        
        return (lastPos == 0);
    }
	
	public static void main(String args[])
	{
		int[] input = {2,3,1,1,4};
		boolean output = canJump(input);
		System.out.println(output);
	}
}
