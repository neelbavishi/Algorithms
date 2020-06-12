package com.interview.designpatterns.Decorator;

public abstract class Currency {
	String description;
	
	public String getCurrencyDescription(){
     return description;}
	public abstract double cost(double value);
}
