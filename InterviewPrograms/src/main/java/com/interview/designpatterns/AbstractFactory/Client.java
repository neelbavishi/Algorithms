package com.interview.designpatterns.AbstractFactory;

public class Client {

	public void buildAnyWindow(WidgetFactory factory){
		Window window=factory.buildWindow();
		window.repiant();
	}
}
