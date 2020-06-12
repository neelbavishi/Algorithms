package com.interview.random;

public class IsRobotBounded {
	
	/*
	 * So, you are at the centre (0,0) and facing North (0,1). You may draw the 4
	 * co-ordinates to understand better. L and R are simply turns from (0,1). You
	 * only move when there is a G. The 4 directions clockwise are: {N : (0,1), E :
	 * (1, 0), S: (0, -1), W: (-1, 0)} Now taking this 4 element array above-
	 * 
	 * When you are in N, R means turn E, i.e one step in prev array. L means turn
	 * W, 3 steps When you are in E, R means turn S, i.e one step in prev array. L
	 * means turn N, 3 steps- assuming array is circular When you are in S, R means
	 * turn W, i.e one step in prev array. L means turn E, 3 steps When you are in
	 * W, R means turn N, i.e one step in prev array assuming array is circular. L
	 * means turn S, 3 steps
	 */

	public boolean isRobotBounded(String ins) {
        int x = 0, y = 0, dIndex = 0, 
        dir[][] = {{0, 1},{1, 0}, {0, -1}, {-1, 0}}; // {N, E, S, W }
        // start facing {0,1}  i.e North
        for (int i = 0; i < ins.length(); i++){
            if (ins.charAt(i) == 'R')
                // turn to east , i.e one step in dir array
                dIndex = (dIndex + 1) % 4; 
            else if (ins.charAt(i) == 'L')
                // turn to west , i.e one step in dir array
                dIndex = (dIndex + 3) % 4;
            else {
                // move in dir
                x += dir[dIndex][0]; y += dir[dIndex][1];
            }
        }
        // return (if at centre) or if facing any direction but north
        return (x == 0 && y == 0) || dIndex > 0;
    }
}


