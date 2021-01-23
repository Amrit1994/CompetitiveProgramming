package com.datastructure.linkedlist;

public class SearchElement {

	Node head;
	public static class Node{
		Node next;
		int data;
		public Node(int data) {
			this.next = null;
			this.data = data;
					
		}
	}
	
	// iterative
	public boolean findNode(int key) {
		Node n = head;
		int count =1;
		while(n!=null) {
			if(n.data == key) {
				System.out.println("Found at "+ count);
				return true;
//				break;
			}else {
				n = n.next;
				count++;
			}
		}
		return false;
	}
	
	
	//recursive
	public boolean findNodeRecurseive(int key, Node head) {
		Node n = head;
		
		if(n == null) {
			return false;
		}
		
		if(n.data == key) {
			return true;
		}
		return findNodeRecurseive(key, n.next);
		
		
	}
	
	public static void main(String[] args) {
		
		SearchElement searchElement = new SearchElement();
		searchElement.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node four = new Node(40);
		Node five = new Node(50);
		searchElement.head.next = second;
		second.next = third;
		third.next = four;
		four.next = five;
		
		//System.out.println(searchElement.findNode(40));
		System.out.println(searchElement.findNodeRecurseive(400, searchElement.head));
	}
}
