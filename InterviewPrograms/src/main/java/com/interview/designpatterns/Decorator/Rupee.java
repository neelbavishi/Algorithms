package com.interview.designpatterns.Decorator;


public class Rupee extends Currency {
     double  val;
     
     public Rupee(){
    	 description="Rupee";
     }
	
	@Override
	public double cost(double value) {
		val=value;
		return val;
	}
	
	

}
