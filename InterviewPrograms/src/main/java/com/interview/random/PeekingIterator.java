package com.interview.random;

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
 private Iterator<Integer> iter;
 private Integer nextNum;
 
	public PeekingIterator(Iterator<Integer> iterator) {
	    this.iter = iterator;
	    this.nextNum = iterator.hasNext()==true ? iterator.next():null;
	}
	
 // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
     return nextNum;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer tmp = nextNum;
		nextNum = iter.hasNext() ? iter.next() : null;
		return tmp;
	}
	
	@Override
	public boolean hasNext() {
	    if(nextNum == null)
         return false;
     else
         return true;
	}
}
