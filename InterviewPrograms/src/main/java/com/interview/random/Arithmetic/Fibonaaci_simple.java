package com.interview.random.Arithmetic;

public class Fibonaaci_simple {
	
	public static void main(String[] args) {
		new Fibonaaci_simple().find();
	}
	
	public void find(){
		int a=0;
		int b=1;
		int c;
		System.out.println(b);
		for(int i=0; i<5; i++){
			c=a+b;
			a=b;
			b=c;
			System.out.println(b);
			
		}
	}

}
