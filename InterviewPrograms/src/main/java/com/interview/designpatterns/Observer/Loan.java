package com.interview.designpatterns.Observer;

import java.util.ArrayList;

public class Loan implements Subject {
	ArrayList<Observer>observers=new ArrayList<Observer>();
	

	String bank;
	float interest;
	String type;
	
	public Loan(String bank, float interest, String type){
		this.bank=bank;
		this.interest=interest;
		this.type=type;
	}
	
	public float getInterest(){
		return interest;
	}
	
	public void setInterest(float interest){
		this.interest=interest;
		notifyUser();
	}
	
	public String getBank(){
		return bank;
	}
	
	public String getType(){
		return type;
	}

	@Override
	public void addRegister(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeRegister(Observer observer) {
	     observers.remove(observer);
	     
		
	}

	@Override
	public void notifyUser() {
		for(Observer observer:observers){
			System.out.println("notify observer about interest on "+getType()+" for "+getBank());
			observer.update(interest);
		}
		
	}
	
	
	
	
}
