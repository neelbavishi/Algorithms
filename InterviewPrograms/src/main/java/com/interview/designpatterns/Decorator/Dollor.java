package com.interview.designpatterns.Decorator;


public class Dollor extends Currency {
     double val;
	public Dollor(){
		description="Dollor";
	}
	@Override
	public double cost(double value) {
	val=value;
		return val;
	}
}
