package com.datastructure.linkedlist;

public class InsertAtTheEnd {

	Node head;

	public static class Node {
		Node next;
		int data;

		public Node(int data) {
			super();
			next = null;
			this.data = data;
		}

	}

	public void append(int new_data) {
		Node new_node = new Node(new_data);

		if (head == null) {
			head = new Node(new_data);
			return; // break out from loop without returning anything
		}

		new_node.next = null;
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		return;
	}

	public void printList(Node head) {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		InsertAtTheEnd atTheEnd = new InsertAtTheEnd();
		atTheEnd.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node four = new Node(40);
		atTheEnd.head.next = second;
		second.next = third;
		third.next = four;
		// atTheEnd.printList(atTheEnd.head);
		atTheEnd.append(50);
		// System.out.println();
		atTheEnd.printList(atTheEnd.head);
	}
}
