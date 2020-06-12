package com.interview.datastructures.List;

public class ArrayListImplementation {
	public static void main(String[] args) {
		ArrayList arrlist = new ArrayList();
		String s1 = new String("a"); // index 0
		String s2 = new String("b"); // index 1
		String s3 = new String("c"); // index 2
		
		System.out.println(" Elements before deletion are ");

		arrlist.add(s1);
		arrlist.add(s2);
		arrlist.add(s3);
		
		arrlist.disp();
		arrlist.remove(2);

		arrlist.disp();
		arrlist.remove(3);
	}
}

