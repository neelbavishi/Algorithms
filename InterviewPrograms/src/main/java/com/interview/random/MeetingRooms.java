package com.interview.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MeetingRooms {

	public boolean canAttendMeetings(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return true;
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < intervals.length - 1; i++) {
            int[] i1 = intervals[i];
            int[] i2 = intervals[i + 1];
            
            if (i2[0] < i1[1]) return false;
        }
        
        return true;
    }
	
	public int minMeetingRooms(int[][] intervals) {
        if (intervals.length < 2) return intervals.length;
        
        // Event is either a meeting start or meeting end
        Map<Integer, List<Integer>> events = new TreeMap<>();

        for (int[] interval : intervals) {
            int startTime = interval[0];
            int endTime = interval[1];
            events.putIfAbsent(startTime, new ArrayList<Integer>());
            events.putIfAbsent(endTime, new ArrayList<Integer>());
            
            // Add room for meeting start
            events.get(startTime).add(1);
            // Subtract room for meeting end
            events.get(endTime).add(-1);
        }
        
        int maxSimultaneousRooms = 0;
        int rooms = 0;
        // Iterate events
        for (Integer time : events.keySet()) {
            // Here contains all the meeting starts and ends at that time
            List<Integer> counts = events.get(time);
            for (Integer count : counts) {
                rooms += count;
            }
            // Compare to max simultaneous rooms
            maxSimultaneousRooms = Math.max(maxSimultaneousRooms, rooms);
        }
        return maxSimultaneousRooms;
    }
}
