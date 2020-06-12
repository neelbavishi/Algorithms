package com.interview.designpatterns.Decorator;


public class USDDollor extends Decorator {
	Currency currency;
	public USDDollor(Currency currency){
		this.currency=currency;
	}

	@Override
	public String getCurrencyDescription() {
		
		return (currency.getCurrencyDescription()+"usd:US dollor");
	}

	@Override
	public double cost(double value) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
