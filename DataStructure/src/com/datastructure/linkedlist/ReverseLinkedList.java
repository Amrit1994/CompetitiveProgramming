package com.datastructure.linkedlist;

public class ReverseLinkedList {

	Node head;

	public static class Node {
		Node next;
		char data;

		public Node(char data) {
			this.data = data;
			next = null;
		}
	}

	public void push(char new_data) {
		Node n = head;
		Node new_node = new Node(new_data);
		while (n == null) {
			head = new Node(new_data);
			return;
		}
		new_node.next = head;
		head = new_node;
	}

	public void append(char new_data) {
		Node n = head;
		Node new_node = new Node(new_data);
		if(n == null) {
			n = new Node(new_data);
			return;
		}
		new_node.next = null;
		while(n.next != null) {
			n = n.next;
		}
		n.next = new_node;
		//return;
		
	}
	
	
	public Node reverseLinkedList(Node head) {
		Node current = head;
		Node prev = null;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	public void printList(Node head) {
		while (head != null) {
			System.out.println(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		ReverseLinkedList linkedList = new ReverseLinkedList();
		linkedList.head = new Node('a');
		linkedList.append('b');
		linkedList.append('c');
		linkedList.append('d');
		linkedList.append('e');
		linkedList.append('f');
		System.out.println("");
		System.out.println("Given linked list ");
		linkedList.printList(linkedList.head);
		linkedList.head = linkedList.reverseLinkedList(linkedList.head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		linkedList.printList(linkedList.head);

	}
}
