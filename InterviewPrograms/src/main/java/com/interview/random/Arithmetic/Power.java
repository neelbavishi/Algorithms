package com.interview.random.Arithmetic;

public class Power {
	public static int power(int x, int n){
		if (n==0)
			return 1;
		if(n==1)
			return x;
		if(n%2 == 0)
			return power(x*x,n/2);
		else
			return (power(x*x,n/2)*x);
					
	}
	
	public static void main(String []args){
		int powerVal = power(2,3);
		System.out.println(powerVal);
	}

}
