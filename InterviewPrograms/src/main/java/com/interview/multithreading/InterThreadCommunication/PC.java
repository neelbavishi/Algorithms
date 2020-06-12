package com.interview.multithreading.InterThreadCommunication;

public class PC {

	public static void main(String[] args) {
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
		new Consumer(q);
		new Consumer(q);
	}
	
}
