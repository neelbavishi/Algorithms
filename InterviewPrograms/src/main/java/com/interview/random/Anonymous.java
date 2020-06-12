package com.interview.random;

import java.util.*;

public class Anonymous {
    public static void main(String args[]) {

        // create an ArrayList and add
        // some Integer objects to it

        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(37));
        list.add(new Integer(-59));
        list.add(new Integer(83));

        // sort the list in the usual (ascending order)

        Collections.sort(list);
        System.out.println(list);

        // sort the list in descending order
        // using a function object implemented
        // via an anonymous class

        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                int a = ((Integer)o1).intValue();
                int b = ((Integer)o2).intValue();
                return a < b ? 1 : a == b ? 0 : -1;
            }
        });
        System.out.println(list);
    }
}