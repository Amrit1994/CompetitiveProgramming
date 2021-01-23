package com.datastructure.linkedlist;

public class SortTheLinkedList {

	Node head;

	static class Node {

		int data;
		Node next;

		Node(int data) {
		
			this.data = data;
			next = null;
		}
	}
	
	public void append(int data) {
		Node new_node  = new Node(data);
		if(head == null) {
			head = new Node(data);
		}
		Node last = head;
		new_node.next = null;
		while(last.next != null) {
			last = last.next;
		}
		last.next = new_node;
	}
	
	public void sortList() {
		
		int[] count = {0,0,0};
		
		Node ptr = head;
		
		while(ptr != null) {
			
			count[ptr.data]++;
			ptr = ptr.next;
		}
		
		int i =0; 
		ptr = head;
		
		while(ptr != null) {
			if(count[i] == 0) {
				i++;
			}else {
				System.out.println(i);
				ptr.data = i;
				--count[i];
				ptr =ptr.next;
			}
		}
	}
	
	public void printList(Node node) {
		Node n = node;
		while(n != null) {
			System.out.print(n.data+ " ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		SortTheLinkedList linkedList = new SortTheLinkedList();
		linkedList.head = new Node(0);
		linkedList.append(1);
		linkedList.append(0);
		linkedList.append(2);
		linkedList.append(1);
		linkedList.append(1);
		linkedList.append(1);
		linkedList.append(2);
		linkedList.append(1);
		linkedList.append(2);
		linkedList.printList(linkedList.head);
		linkedList.sortList();
		System.out.println();
		linkedList.printList(linkedList.head);
		
	}
}
