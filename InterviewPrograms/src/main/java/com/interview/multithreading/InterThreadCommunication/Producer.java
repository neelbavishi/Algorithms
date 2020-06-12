package com.interview.multithreading.InterThreadCommunication;

public class Producer implements Runnable {
	Q q;
	Thread t;
 public Producer(Q q){
	this.q=q;
	t=new Thread(this,"producer");
	t.start();
	
	
}

public void run() {
	int i=0;
      for(int j=0; j<6; j++){
    	 q.put(i++);
      }
	
}
}
