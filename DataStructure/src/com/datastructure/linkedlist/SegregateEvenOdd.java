package com.datastructure.linkedlist;

public class SegregateEvenOdd {
	Node head;
	static class Node{
		Node next;
		int data;
		Node(int data){
			this.data = data;
		}
	}

	
	
	public void append(int data) {
		Node new_node = new Node(data);
		if(head == null) {
			head = new Node(data);
		}else {
			Node last = head;
			new_node.next = null;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
	}
	
	public void segregateEvenOdd(Node node) {
		Node curr = node;
		
		while(curr != null) {
			if(curr.data%2 == 0) {
				append(curr.data);
				curr = curr.next;
			}else {
				curr = curr.next;
			}
		}
		
		Node ptr = node;
		while(ptr != null) {
			if(ptr.data%2 != 0) {
				append(ptr.data);
				ptr = ptr.next;
			}else {
				ptr = ptr.next;
			}
		}
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		SegregateEvenOdd list = new SegregateEvenOdd();
		list.append(8);
		list.append(12);
		list.append(10);
		list.append(5);
		list.append(6);
		list.append(3);
		list.append(2);
		list.append(1);
		
		SegregateEvenOdd list2 = new SegregateEvenOdd();
		list2.segregateEvenOdd(list.head);
		list2.printList();
		
		
		
		
	}
}
