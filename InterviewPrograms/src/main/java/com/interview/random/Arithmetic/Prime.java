package com.interview.random.Arithmetic;

import java.util.Scanner;

public class Prime {
	private static Scanner scnr;
	public static String isPrimeOrNot(int num) { 
		if (num < 0) { 
			return "not valid"; 
		} else if (num == 0 || num == 1) { 
			return "not prime"; 
		} else if (num == 2 || num == 3) { 
			return "prime number"; 
		} else if ((num * num - 1) % 24 == 0) {
			return "prime"; 
		} else { 
			return "not prime"; 
		}
    }
	public static void main(String args[]) { 
		scnr = new Scanner(System.in); 
		int number = Integer.MAX_VALUE; 
		System.out.println("Enter number to check if prime or not "); 
		while (number != 0) { 
			number = scnr.nextInt(); 
		    System.out.println( number + " is: " + isPrimeOrNot(number)); 
		} 
	}
}
