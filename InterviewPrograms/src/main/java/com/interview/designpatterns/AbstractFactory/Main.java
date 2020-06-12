package com.interview.designpatterns.AbstractFactory;

public class Main {
	
	public static void main(String[] args) {
		String platform="macwindow";
		WidgetFactory factory=null;
		Client client= new Client();
		if(platform.equalsIgnoreCase("mswindow")){
			factory=new MSWidgetFactory();
		}
		else if(platform.equalsIgnoreCase("macwindow")){
			factory=new MACWidgetFactory();
		}
		client.buildAnyWindow(factory);
	}

}
