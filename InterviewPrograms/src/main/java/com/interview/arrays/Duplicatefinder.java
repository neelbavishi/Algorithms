package com.interview.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Duplicatefinder {

	public static void main(String[] args) {

		int[] list = { 2, 5, 7, 9, 7, 6, 5, 2 };
		new Duplicatefinder().go(list);
	}

	public void go(int[] list) {
		Set<Integer> numbers = new HashSet<Integer>();
		ArrayList<Integer> dupNumbers = new ArrayList<Integer>();
		for (int i : list) {
			if (numbers.contains(i)) {
				dupNumbers.add(i);
			}
			numbers.add(i);
		}

		for (int i : dupNumbers) {
			System.out.println(i);
		}

	}
}