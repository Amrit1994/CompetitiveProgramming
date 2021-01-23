package com.datastructure.linkedlist;

public class FindLength {

	Node head;
	
	public static class Node{
		Node next;
		int data;
		public Node(int data) {
			this.data =data;
			this.next = null;
		}
	}
	
	int count = 0;
	
	//iterative
	public void printList() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
			count++;
		}
		System.out.println();
		System.out.println("Length of Linked List== "+count);
	}
	
	
	//recursive
	public int findLength(Node head) {
		Node n = head;
		//int count = 0;
		if(n==null) {
			return 0;
		}
		
		return 1+findLength(n.next);
		//System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		FindLength findLength = new FindLength();
		findLength.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node four = new Node(40);
		Node five = new Node(50);
		
		findLength.head.next = second;
		second.next = third;
		third.next = four;
		four.next = five;
		//findLength.printList();
	System.out.println(findLength.findLength(findLength.head));
		
	}
}
