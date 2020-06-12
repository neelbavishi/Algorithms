package com.interview.arrays.search;

import java.util.Arrays;

public class BinarySearch {
	
	static int binarySearch(int[] array, int value, int left, int right) {
	      if (left > right)
	            return -1;
	      int middle = (left + right) / 2;
	      if (array[middle] == value)
	            return middle;
	      else if (array[middle] > value)
	            return binarySearch(array, value, left, middle - 1);
	      else
	            return binarySearch(array, value, middle + 1, right);           
	}
	
	public static void main(String args[]){
		int inputArray[]={2,4,7,11,17,21};
		int lengthOfArray = inputArray.length;
		Arrays.sort(inputArray);
        int index=-1, key=17;
        try{
        	index=binarySearch(inputArray, key, 0, lengthOfArray-1);
        	System.out.println("element found at index "+index);
        }catch(Exception e){
        	e.printStackTrace();
        }
	}

}
