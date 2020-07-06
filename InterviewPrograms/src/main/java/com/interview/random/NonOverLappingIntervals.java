package com.interview.random;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverLappingIntervals {
	public int eraseOverlapIntervals(int[][] intervals) {

		int len = intervals.length;
		if (len == 0)
			return 0;
		int ans = 0;
		Arrays.sort(intervals, Comparator.comparingInt(x -> x[1]));
		int end = intervals[0][1];

		for (int i = 1; i < len; i++) {
			int lo = intervals[i][0];
			int hi = intervals[i][1];
			if (lo < end) {
				ans++;
			} else {
				end = hi;
			}
		}
		return ans;
	}
}
