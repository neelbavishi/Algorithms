package com.interview.datastructures.Stack;

public interface Stack {  
	 /** 
	  * @return the size of stack 
	  */  
	 public int size();  
	  
	 /** 
	  * @return wheather stack is empty or not. 
	  */  
	 public boolean isEmpty();  
	  
	 /** 
	  * @return top element of stack withour removing it. 
	  */  
	 public Object top() throws StackEmptyException;  
	  
	 /** 
	  * @param o 
	  *            element inserted into stack. 
	  */  
	 public void push(Object o) throws StackOverflowException;  
	  
	 /** 
	  * @return top object from stack and removes it from stack. 
	  */  
	 public Object pop() throws StackEmptyException;  
	}  
