package com.interview.strings;
public class Palindrome {
	private String pal;

	// Get the first and last characters of the String.
	public static boolean isPalindrome(String word) {

		if (word.length() <= 1) {
			// String has only one character so it
			// is a Palindrome by definition.
			return true; // BASE CASE.
		}

		int left = 0; // index of leftmost unchecked char
		int right = word.length() - 1; // index of the rightmost

		while (left < right) { // continue until they reach center
			if (word.charAt(left) != word.charAt(right)) {
				return false; // if chars are different, finished
			}
			left++; // move left index toward the center
			right--; // move right index toward the center
		}

		return true; // if finished, all chars were same
	}
	
	public static void main(String args[]){
		boolean bool = isPalindrome("nelen");
		if(bool == true){
				System.out.println("String is a palindrome");
			}
			else{
				System.out.println("String is not a palindrome");
			}
		}
	}
	

