package com.interview.designpatterns.Decorator;


public class CurrencyTest {

	
	public static void main(String []args){
		
		Currency usd=new USDDollor(new Dollor());
		Currency ssd=new SSDDollor(new Dollor());
		System.out.println(usd.getCurrencyDescription());
		System.out.println(ssd.getCurrencyDescription());
	
	}
}
