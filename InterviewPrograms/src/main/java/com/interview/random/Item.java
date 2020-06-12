package com.interview.random;


public class Item{
	int relativeProb;
    String name;
    
    public Item(String name, int relativeProb) {
    	this.name = name;
    	this.relativeProb = relativeProb;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getProbability() {
    	return relativeProb;
    }
}
