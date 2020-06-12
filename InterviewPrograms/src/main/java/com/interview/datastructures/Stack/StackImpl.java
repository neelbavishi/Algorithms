package com.interview.datastructures.Stack;

/**
 * 
 * This is class implementation of stack using array
 * 
 */
public class StackImpl implements Stack {
	Object[] stackArr = new Object[10];

	int pos = -1;

	public boolean isEmpty() {
		if (this.size() == 0)
			return true;
		return false;
	}

	public Object pop() throws StackEmptyException {
		if (pos == -1)
			throw new StackEmptyException("Stack is empty");
		Object obj = stackArr[pos];
		stackArr[pos] = null;
		pos--;
		return obj;
	}

	public void push(Object o) throws StackOverflowException {
		int npos = pos + 1;
		if (npos == 10)
			throw new StackOverflowException("Stack is full");
		pos = npos;
		stackArr[pos] = o;
	}

	public int size() {
		// TODO Auto-generated method stub
		return pos + 1;
	}

	public Object top() throws StackEmptyException {
		if (pos == -1)
			throw new StackEmptyException("Stack is empty");
		Object obj = stackArr[pos];
		return obj;
	}

}
