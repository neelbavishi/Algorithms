package com.interview.arrays;

public class MagicNumber {
    int i = 0;
    int a = 0;

    public static void main(String[] args) {

        int b = new MagicNumber().recursion();
        System.out.println(b);
    }

    public int recursion() {

        if (i == 4) {
            return a;
        }
        i++;
        a += i;

        return recursion();

    }

}
