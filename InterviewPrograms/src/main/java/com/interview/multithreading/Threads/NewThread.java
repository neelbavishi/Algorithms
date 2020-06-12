package com.interview.multithreading.Threads;

public class NewThread implements Runnable {
	
	Thread t;
	public NewThread(){
		t=new Thread(this,"hi");
		t.start();
		
	}

	public static void main(String[] args) {
		new NewThread();
		
		
	}
	
	public void run() {
	System.out.println("hi");
		
	}
}
