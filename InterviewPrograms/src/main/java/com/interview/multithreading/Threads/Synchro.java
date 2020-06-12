package com.interview.multithreading.Threads;

public class Synchro {
	
	public static void main(String[] args) {
		Caller c=new Caller();
		Calling call=new Calling(c,"Hello");
		Calling call1=new Calling(c,"New");
		Calling call2=new Calling(c,"World");
		try{
		call.t.join();
		call1.t.join();
		call2.t.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
				
				
		
		
	}

}
