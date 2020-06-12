package com.interview.datastructures.LinkedList;

public class SinglyLinkedList {
	// reference to the head node.
	private Node head;
	private int listCount;

	// LinkedList constructor
	public SinglyLinkedList() {
		// this is an empty list, so the reference to the head node
		// is set to a new node with no data
		head = new Node(null);
		listCount = 0;
	}

	public void add(Object data)
	// post: appends the specified element to the end of this list.
	{
		Node temp = new Node(data);
		Node current = head;
		// starting at the head node, crawl to the end of the list
		while (current.getNext() != null) {
			current = current.getNext();
		}
		// the last node's "next" reference set to our new node
		current.setNext(temp);
		listCount++;// increment the number of elements variable
	}

	public void add(Object data, int index)
	// post: inserts the specified element at the specified position in this
	// list.
	{
		Node temp = new Node(data);
		Node current = head;
		// crawl to the requested index or the last element in the list,
		// whichever comes first
		for (int i = 1; i < index && current.getNext() != null; i++) {
			current = current.getNext();
		}
		// set the new node's next-node reference to this node's next-node
		// reference
		temp.setNext(current.getNext());
		// now set this node's next-node reference to the new node
		current.setNext(temp);
		listCount++;// increment the number of elements variable
	}

	public Object get(int index)
	// post: returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index <= 0)
			return null;

		Node current = head.getNext();
		for (int i = 1; i < index; i++) {
			if (current.getNext() == null)
				return null;

			current = current.getNext();
		}
		return current.getData();
	}

	public boolean remove(int index)
	// post: removes the element at the specified position in this list.
	{
		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;

		Node current = head;
		for (int i = 1; i < index; i++) {
			if (current.getNext() == null)
				return false;

			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		listCount--; // decrement the number of elements variable
		return true;
	}

	public int size()
	// post: returns the number of elements in this list.
	{
		return listCount;
	}

	public String toString() {
		Node current = head.getNext();
		String output = "";
		while (current != null) {
			output += "[" + current.getData().toString() + "]";
			current = current.getNext();
		}
		return output;
	}

	// Iterative
	public void reverse() {
		Node current = head;
		head = null;
		while (current != null) {
			Node previous = current;
			current = current.getNext();
			previous.setNext(head);
			head = previous;
		}
	}

	boolean hasLoop(Node head) {

		if (head == null) // list does not exist..so no loop either.
			return false;

		Node slow, fast; // create two references.

		slow = fast = head; // make both refer to the start of the list.

		while (true) {

			slow = slow.getNext(); // 1 hop.

			if (fast.getNext() != null)
				fast = fast.getNext().getNext(); // 2 hops.
			else
				return false; // next node null => no loop.

			if (slow == null || fast == null) // if either hits null..no loop.
				return false;

			if (slow == fast) // if the two ever meet...we must have a loop.
				return true;
		}
	}
	
	public Node findLoopStart(Node node) {
		  if (node == null || head == null) {
		      return null;
		  }

		  Node loopStartNode = null;
		  Node slow = head;
		  Node fast = head;

		  while (slow != null && fast != null) {
		      slow = slow.getNext();
		      if (fast.getNext() == null) {
		          loopStartNode = null;
		          break;
		      }
		      fast = fast.getNext().getNext();

		      // If slow and fast point to the same node, it means that the
		      // linkedList contains a loop.
		      if (slow == fast) {

		          slow = head;

		          while (slow != fast) {
		              // Keep incrementing the two pointers until they both
		              // meet again. When this happens, both the pointers will
		              // point to the beginning of the loop
		              slow = slow.getNext(); // Can't be null, as we have a loop
		              fast = fast.getNext(); // Can't be null, as we have a loop
		          }

		          loopStartNode = slow;
		          break;
		      }
		  }

		  return loopStartNode;
		}

	private class Node {
		// reference to the next node in the chain,
		// or null if there isn't one.
		Node next;
		// data carried by this node.
		// could be of any type you need.
		Object data;

		// Node constructor
		public Node(Object _data) {
			next = null;
			data = _data;
		}

		// another Node constructor if we want to
		// specify the node to point to.
		public Node(Object _data, Node _next) {
			next = _next;
			data = _data;
		}

		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}

		public void setData(Object _data) {
			data = _data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node _next) {
			next = _next;
		}
	}
}
