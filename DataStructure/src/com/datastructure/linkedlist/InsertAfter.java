package com.datastructure.linkedlist;

public class InsertAfter {
	
	Node head;
	
	static class Node{
		Node next;
		int data;
		public Node(int data) {
			super();
			this.next = null;
			this.data = data;
		} 
		
		
	}
	
	public void insertAfter(Node prev_node, int new_data) {
		if(prev_node == null) {
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	public void printList(Node head) {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data+ " ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		InsertAfter after = new InsertAfter();
		after.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		after.head.next = second;
		second.next = third;
		
		//after.printList(after.head);
		
		after.insertAfter(after.head.next, 25);
		after.printList(after.head);
	}

}
