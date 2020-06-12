package com.interview.designpatterns.Strategy;

public class Main {

	public static void main(String [] args){
		Context context=new Context();
		
		context.typeOfStratergy(new ZipStratergy());
		context.compressStart();
		
	}
}
