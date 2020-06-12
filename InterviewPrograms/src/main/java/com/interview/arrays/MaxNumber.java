package com.interview.arrays;

public class MaxNumber {
	static int[] array = { 6, 67, 2, 54, 98, 45, 23, 45, 68, 0 };
	static int i = 0;
	static int temp = array[0];

	public static void main(String[] args) {
		new MaxNumber().findMax();
		System.out.println(temp);

	}

	public void findMax() {
		if (i == array.length - 1) {
			return;
		}
		if (array[++i] > temp) {
			temp = array[i];

		}
		findMax();

	}

}
