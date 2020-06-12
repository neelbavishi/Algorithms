package com.interview.designpatterns.Observer;

public interface Subject {
	public void addRegister(Observer observer);
	public void removeRegister(Observer observer);
	public void notifyUser();

}
