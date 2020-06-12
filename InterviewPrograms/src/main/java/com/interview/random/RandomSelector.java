package com.interview.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSelector {
	static Random rand = new Random();
	
    public static Item getRandom(List<Item> items) {
    	int totalSum = 0;
    	for(Item item : items) {
            totalSum = totalSum + item.relativeProb;
        }
        int index = rand.nextInt(totalSum);
        int sum = 0;
        int i=0;
        while(sum < index) {
             sum = sum + items.get(i++).relativeProb;
        }
        return items.get(Math.max(0,i-1));
    }
    
    public static void main(String args[]) {
    	List<Item> itemList = new ArrayList<Item>();
    	Item item1 = new Item("item1", 10);
    	Item item2 = new Item("item2", 20);
    	Item item3 = new Item("item3", 15);
    	Item item4 = new Item("item4", 5);
    	
    	itemList.add(item1);
    	itemList.add(item2);
    	itemList.add(item3);
    	itemList.add(item4);
    	
    	Item result = getRandom(itemList);
    	System.out.println(result.getName());
    }
}



