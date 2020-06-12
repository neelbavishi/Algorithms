package com.interview.random.Arithmetic;

public class SubstractTwo_Find {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 5 };
		int i = 0;
		int j = 1;
		int num = 2;
		while (j < 6) {
			if (arr[j] - arr[i] == num) {
				System.out.println(arr[i] + " " + arr[j]);
				i++;
				j++;
			} else if ((arr[j] - arr[i]) > num) {
				System.out.println(">num:" + (arr[j] - arr[i]));
				i++;
				System.out.println("i:" + i);
				if (i == j) {
					j++;
				}
				System.out.println(j);
			} else if ((arr[j] - arr[i]) < num) {
				System.out.println("<num:" + (arr[j] - arr[i]));

				j++;
				System.out.println("j:" + j);
			}
		}
	}

}
