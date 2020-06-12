package com.interview.arrays;

public class StringtoInt {

    public static void main(String[] args) {

        int Intval = convInt("123");
        if (Intval + 10 == 133) {
            System.out.println("converted string to int: " + (Intval + 10));
        }
    }

    public static int convInt(String s) throws NumberFormatException {
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            if (((int) s.charAt(i)) >= 48 && ((int) s.charAt(i)) <= 57) {
                num = num * 10 + s.charAt(i) - '0';
            } else {
                throw new NumberFormatException();
            }

        }

        return num;
    }
}
