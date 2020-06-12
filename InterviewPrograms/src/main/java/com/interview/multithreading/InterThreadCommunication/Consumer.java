package com.interview.multithreading.InterThreadCommunication;

public class Consumer implements Runnable {
	Q q;
	Thread t;
public Consumer(Q q){
	this.q=q;
	t=new Thread(this,"consumer");
	t.start();
	
	
}

public void run() {
	
    for(int j=0; j<6; j++){
   	 q.get();
    }
	

	
}
}
