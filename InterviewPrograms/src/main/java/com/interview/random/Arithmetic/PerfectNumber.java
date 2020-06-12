package com.interview.random.Arithmetic;

import java.util.*;

public class PerfectNumber {
        private static Scanner input;

		public static void main(String[] args) {
                System.out.println("Enter any number");
                input = new Scanner(System.in);
                int num = input.nextInt();
                int perfectNo = 0;
                int i;
                System.out.println("Factors are:");
                for (i = 1; i < num; i++) {
                        if (num % i == 0) {
                                perfectNo += i;
                                System.out.println(i);
                        }
                }
                if (perfectNo == num) {
                        System.out.println("number is a perfect number");
                } else {
                        System.out.println("number is not a perfect number");
                }
        }
}