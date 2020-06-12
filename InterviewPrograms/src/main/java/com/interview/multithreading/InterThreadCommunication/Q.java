package com.interview.multithreading.InterThreadCommunication;

public class Q {
	int i;
	boolean success = false;

	synchronized public void get() {
		while (!success) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		success = false;
		System.out.println("Get:" + i);
		notifyAll();

	}

	synchronized public void put(int i) {
		while (success) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.i = i;
		success = true;
		System.out.println("put:" + i);
		notifyAll();

	}

}
