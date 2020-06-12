package com.interview.datastructures.Queue;

public class QueueMain {
	public static void main(String args[]){
		Queue q = new Queue();
		
		Person alice = new Person("Alice");
		Person bob = new Person("Bob");
		
		q.enqueue(alice);
		System.out.println(((Person)q.peek()).getName());
		
		q.enqueue(bob);
		
		q.dequeue();
		
		System.out.println(((Person)q.peek()).getName());
		q.dequeue();
	}
}
