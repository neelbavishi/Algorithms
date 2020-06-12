package com.interview.datastructures.LinkedList;

public class DoublyLinkedList {
	private Node first;

	private Node last;
	
	public class Node {
		public long dData; // data item

		public Node next; // next link in list

		public Node previous; // previous link in list

		public Node(long d) {
			dData = d;
		}

		public void displayNode() {
			System.out.print(dData + " ");
		}

	}

	public DoublyLinkedList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(long dd) {
		Node newNode = new Node(dd);

		if (isEmpty())
			last = newNode;
		else
			first.previous = newNode;
		newNode.next = first;
		first = newNode;
	}

	public void insertLast(long dd) {
		Node newNode = new Node(dd);
		if (isEmpty())
			first = newNode;
		else {
			last.next = newNode;
			newNode.previous = last;
		}
		last = newNode;
	}

	public Node deleteFirst() {
		Node temp = first;
		if (first.next == null)
			last = null;
		else
			first.next.previous = null;
		first = first.next;
		return temp;
	}

	public Node deleteLast() {
		Node temp = last;
		if (first.next == null)
			first = null;
		else
			last.previous.next = null;
		last = last.previous;
		return temp;
	}

	public boolean insertAfter(long key, long dd) {
		Node current = first;
		while (current.dData != key) {
			current = current.next;
			if (current == null)
				return false; // cannot find it
		}
		Node newNode = new Node(dd); // make new link

		if (current == last) // if last link,
		{
			newNode.next = null;
			last = newNode;
		} else // not last link,
		{
			newNode.next = current.next;

			current.next.previous = newNode;
		}
		newNode.previous = current;
		current.next = newNode;
		return true; // found it, insert
	}

	public Node deleteKey(long key) {
		Node current = first;
		while (current.dData != key) {
			current = current.next;
			if (current == null)
				return null; // cannot find it
		}
		if (current == first) // found it; first item?
			first = current.next;
		else
			current.previous.next = current.next;

		if (current == last) // last item?
			last = current.previous;
		else
			// not last
			current.next.previous = current.previous;
		return current; // return value
	}

	public void displayForward() {
		System.out.print("List (first to last): ");
		Node current = first; // start at beginning
		while (current != null) // until end of list,
		{
			current.displayNode();
			current = current.next; // move to next link
		}
		System.out.println("");
	}

	public void displayBackward() {
		System.out.print("List : ");
		Node current = last;
		while (current != null) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		DoublyLinkedList theList = new DoublyLinkedList();

		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertLast(33);
		theList.insertLast(55);

		theList.displayForward();
		theList.displayBackward();

		theList.deleteFirst();
		theList.deleteLast();
		theList.deleteKey(11);

		theList.displayForward();

		theList.insertAfter(22, 77); // insert 77 after 22
		theList.insertAfter(33, 88); // insert 88 after 33

		theList.displayForward();
	}

}
