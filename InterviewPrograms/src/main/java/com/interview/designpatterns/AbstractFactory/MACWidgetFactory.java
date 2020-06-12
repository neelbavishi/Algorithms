package com.interview.designpatterns.AbstractFactory;

public class MACWidgetFactory implements WidgetFactory{

	@Override
	public Window buildWindow() {
		MACWindow window=new MACWindow();
		return window;
	}

}
