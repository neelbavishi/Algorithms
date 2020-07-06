package com.interview.datastructures.List;

public class ReorderList {
	public void reorderList(ListNode head) {
		if (head == null)
			return;
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode second = reverse(slow.next);
		slow.next = null;
		while (head != null && second != null) {
			ListNode n1 = head.next;
			head.next = second;
			head = head.next;
			second = n1;
		}
	}

	private ListNode reverse(ListNode node) {
		if (node == null)
			return node;
		ListNode current = node;
		node = null;
		while (current != null) {
			ListNode prev = current;
			current = current.next;
			prev.next = node;
			node = prev;
		}
		return node;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
