package com.interview.designpatterns.Observer;

public class Observertest {
	
	public static void main(String[]args){
		Newspaper paper=new Newspaper();
		Internet net=new Internet();
		Loan loan=new Loan("HDFC",12.56f,"Education Loan");
		loan.addRegister(paper);
		loan.addRegister(net);
		loan.setInterest(9.8f);
		System.out.println("paper:"+paper.getInterest());
		System.out.println("net:"+net.getInterest());
		
	}

}
