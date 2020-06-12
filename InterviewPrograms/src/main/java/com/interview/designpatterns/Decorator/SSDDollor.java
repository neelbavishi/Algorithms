package com.interview.designpatterns.Decorator;


public class SSDDollor extends Decorator{
Currency currency;

public SSDDollor(Currency currency){
	this.currency=currency;
}

@Override
public String getCurrencyDescription() {
	// TODO Auto-generated method stub
	return (currency.getCurrencyDescription()+"ssd:singapore dollor");
}

@Override
public double cost(double value) {
	// TODO Auto-generated method stub
	return 0;
}







	
}
