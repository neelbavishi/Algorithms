package com.interview.designpatterns.Observer;

public class Newspaper implements Observer {
	
	float interest;

	@Override
	public void update(float interest) {
		this.interest=interest;
		
	}
	public float getInterest(){
		return interest;
	}

	
	
}
