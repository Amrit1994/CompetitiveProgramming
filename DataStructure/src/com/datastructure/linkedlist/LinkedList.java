package com.datastructure.linkedlist;

public class LinkedList {

	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
//	traversing of linkedlist
	public void printList(){
		Node n = head;	
		while(n!=null){
			System.out.print(n.data+ " ");
			n = n.next;
		}
	}
	
	
	public static void main(String args[]){
		LinkedList list = new LinkedList();
		list.head=  new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		list.head.next =second; // Link first node with the second node 
		second.next = third; // Link second node with the third node
		
		list.printList();
	}
}
