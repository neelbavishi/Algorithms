package com.interview.random.Arithmetic;

public class Fibonaaci_recursion {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ":" + fib(i));
		}
	}

	public static long fib(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return fib(n - 2) + fib(n - 1);
		}
	}

}
