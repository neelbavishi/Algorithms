package com.interview.multithreading.Threads;

public class Caller {
	
	public void print(String msg){
		
		System.out.println("["+msg);
		try{
			Thread.sleep(1000);
			
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("]");
	}
	
	

}
