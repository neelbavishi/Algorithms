package com.interview.designpatterns.AbstractFactory;

public class MSWidgetFactory implements WidgetFactory {

	@Override
	public Window buildWindow() {
		MSWindow window=new MSWindow();
		return window;
		
	}

}
