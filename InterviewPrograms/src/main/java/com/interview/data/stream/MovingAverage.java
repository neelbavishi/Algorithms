package com.interview.data.stream;

import java.util.LinkedList;

class MovingAverage {
    double sum;
    int size;
    LinkedList<Integer> list;
 
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.list = new LinkedList<>();
        this.size = size;
    }
 
    public double next(int val) {
        sum += val;
        list.offer(val);
 
        if(list.size()<=size){
            return sum/list.size();
        }
 
        sum -= list.poll();
 
        return sum/size;
    }
}
