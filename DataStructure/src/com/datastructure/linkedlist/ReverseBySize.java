package com.datastructure.linkedlist;

public class ReverseBySize {

	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	public void append(int data) {
		
		Node new_node = new Node(data);
		if(head == null) {
			head = new Node(data);
		}
		new_node.next = null;
		Node last = head;
		while(last.next != null) {
			last = last.next;

		}
		last.next = new_node;
	}
	
	// 1->2->3->4->5->6
	public Node reverseBySize(Node node, int k) {
		Node next =null;
		Node prev = null;
		Node current = node;
		int count = 0;
		while(current != null && count<k) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		
		if(next != null) {
			node.next = reverseBySize(next, 2);
		}
		
		return prev;
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		ReverseBySize reverseBySize = new ReverseBySize();
		reverseBySize.head =  new Node(1);
		reverseBySize.append(2);
		reverseBySize.append(3);
		reverseBySize.append(4);
		reverseBySize.append(5);
		reverseBySize.append(6);
		reverseBySize.printList();
		System.out.println();
		reverseBySize.head = reverseBySize.reverseBySize(reverseBySize.head, 2);
		reverseBySize.printList();
	}
}
