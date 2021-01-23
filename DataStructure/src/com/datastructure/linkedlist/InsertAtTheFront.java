package com.datastructure.linkedlist;

public class InsertAtTheFront {

	Node head;
	public static class Node{
		Node next;
		int data;
		public Node(int data){
			next =null;
			this.data =data;
		}
	}
	
	
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void printList() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data+" ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		InsertAtTheFront atTheFront = new InsertAtTheFront();
		atTheFront.head = new Node(10);
		atTheFront.push(20);
		atTheFront.push(30);
		atTheFront.push(40);
		atTheFront.push(50);
		atTheFront.printList();
	}
}
