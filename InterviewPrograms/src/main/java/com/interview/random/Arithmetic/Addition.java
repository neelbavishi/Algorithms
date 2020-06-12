package com.interview.random.Arithmetic;

public class Addition {
	
	public static void main(String [] args){
		Addition a=new Addition();
		a.sub(3,2);
	}
	public int add(int a,int b){
		
		
		
		int carry=a&b;
		int result=a^b;
		
		while(carry!=0){
			int shiftCarry=carry<<1;
			carry=result&shiftCarry;
			result=result^shiftCarry;
		}
		return result;
	}
	
	
	public void sub(int a, int b){
		int res=add(a,add(~b,1));
		System.out.println(a+"-"+b+":"+res);
	}

} 
