package com.datastructure.linkedlist;

public class MergeTwoSortedList {

	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void addToTheLast(Node node) {
		
		if(head == null) {
			head = node;
		}else {
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = node;
		}
	}
	
	
	// iterative
	public void mergeTwoSortedList(Node headA, Node headB) {
		Node n1 = headA;
		Node n2 = headB;
		while(n1 != null && n2 != null) {
			if(n1.data <= n2.data) {
				Node temp = new Node(n1.data);
				addToTheLast(temp);
				n1 = n1.next;
			}else {
				Node temp = new Node(n2.data);
				addToTheLast(temp);
				n2 = n2.next;
			}
		}
		
		while(n1 != null) {
			Node temp = new Node(n1.data);
			addToTheLast(temp);
			n1 = n1.next;
		}
		
		while(n2 != null) {
			Node temp = new Node(n2.data);
			addToTheLast(temp);
			n2 = n2.next;
		}
		
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}
	
	// recursion
	public Node sortedMerge(Node headA, Node headB) {
		if(headA == null) {
			return headB;
		}
		if(headB == null) {
			return headA;
		}
		
		if(headA.data < headB.data) {
			headA.next = sortedMerge(headA.next, headB);
			return headA;
		}else {
			headB.next = sortedMerge(headA, headB.next);
			return headB;
		}
	}
	
	
	public static void main(String[] args) {
		MergeTwoSortedList list1 = new MergeTwoSortedList();
		list1.head = new Node(5);
//		list1.addToTheLast(new Node(5));
		list1.addToTheLast(new Node(10));
		list1.addToTheLast(new Node(15));
		list1.addToTheLast(new Node(40));
		System.out.println("List 1");
		list1.printList();

		MergeTwoSortedList list2 = new MergeTwoSortedList();
		list2.head = new Node(2);
		list2.addToTheLast(new Node(2));
		list2.addToTheLast(new Node(3));
		list2.addToTheLast(new Node(20));
	//	list2.addToTheLast(new Node(40));
		System.out.println("List 2");
		list2.printList();
		System.out.println("Using iteration == ");
		MergeTwoSortedList list3 = new MergeTwoSortedList();
		list3.mergeTwoSortedList(list1.head, list2.head);
		
		list3.printList();
		System.out.println("Using recursion");
		MergeTwoSortedList list4 = new MergeTwoSortedList();
		list4.head = list4.sortedMerge(list1.head, list2.head);
		list4.printList();
	}
}
