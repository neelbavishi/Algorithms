package com.interview.datastructures.Stack;
	/** 
	 * Throw when stack is full 
	 *  
	 */  
	public class StackOverflowException extends RuntimeException {  
	 /** 
	  * serail ID 
	  */  
	 private static final long serialVersionUID = 1L;  
	  
	 public StackOverflowException(String message) {  
	  super(message);  
	 }  
}
