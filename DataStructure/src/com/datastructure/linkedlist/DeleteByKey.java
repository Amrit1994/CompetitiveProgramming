package com.datastructure.linkedlist;

public class DeleteByKey {

	Node head;
	
	public static class Node{
		Node next;
		int data;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void delete(int key) {
		Node temp = head, prev =null;
		if(temp != null && temp.data == key) {
			temp = temp.next;
			return;
		}
		
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null) {
			//System.out.println(temp.data);
			return;
		}
		prev.next = temp.next;
	}
	
	public void printList() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n =n.next;
		}
	}
	
	
	public static void main(String[] args) {
		DeleteByKey deleteByKey = new DeleteByKey();
		deleteByKey.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node four = new Node(40);
		Node five = new Node(50);
		
		deleteByKey.head.next = second;
		second.next = third;
		third.next = four;
		four.next = five;
		deleteByKey.printList();
		deleteByKey.delete(30);
		System.out.println();
		deleteByKey.printList();
		
	}
}
