package com.interview.multithreading.Threads;

public class Calling implements Runnable {
	Caller target;
	String msg;
	Thread t;
	public Calling(Caller caller,String msg){
		target=caller;
		this.msg=msg;
		t=new Thread(this);
		t.start();
		
	}
	public void run(){
		synchronized(target){
		target.print(msg);
		}
	}

}
