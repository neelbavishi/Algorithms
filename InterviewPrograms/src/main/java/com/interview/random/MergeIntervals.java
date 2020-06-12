package com.interview.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

class MergeIntervals {
    
    class Interval{
       int start;
       int end;
       Interval(int start, int end)
       {
           this.start = start;
           this.end = end;
       }
   }
   
   public int[][] merge(int[][] intervals) {
       
       if(intervals.length==0)
           return intervals;
       
       
       List<Interval> listOfintervals = new ArrayList<Interval>();
       for(int i=0; i<intervals.length; i++)  {
           Interval obj = new Interval(intervals[i][0],intervals[i][1]);
           listOfintervals.add(obj);
       }
       
       Collections.sort(listOfintervals, new Comparator<Interval>()  {
           public int compare(Interval i1, Interval i2){
               return i1.start - i2.start;
           }
       });
       
       Stack<Interval> s = new Stack<Interval>();
       s.push(listOfintervals.get(0));
       
       for(int i=1; i<listOfintervals.size(); i++)
       {
           Interval obj = s.peek();
           if(listOfintervals.get(i).start > obj.end){
               // not over lapping, insert into stack
               s.push(listOfintervals.get(i));
           }
           else {
               //merge intervals
               if(listOfintervals.get(i).start <= obj.end  && listOfintervals.get(i).end >                           obj.end) {
                   Interval o1 = s.pop();
                   o1.end = listOfintervals.get(i).end;
                   s.push(o1);
               }
           }  
       }
       int row = s.size();
       int col = intervals[0].length;
       int[][] res = new int [row][col];
       int k =0;
       while(s.isEmpty()!=true)
       {
           Interval obj = s.pop();
           res[k][0]= obj.start;
           res[k][1] = obj.end;
           k++;
           
       }
       return res;
   }
   
}
