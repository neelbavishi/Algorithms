package com.interview.designpatterns.Observer;

public class Internet implements Observer {
	float interest;

	@Override
	public void update(float interest) {
		this.interest=interest;
		
	}

	public float getInterest(){
		return interest;
	}
	
	
}
