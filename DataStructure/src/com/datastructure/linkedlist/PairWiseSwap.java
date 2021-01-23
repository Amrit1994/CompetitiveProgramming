package com.datastructure.linkedlist;

public class PairWiseSwap {

	//1->2->3->4->5->Null
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	// iterative
	public void pairWiseSwap(Node node) {
		
		Node temp = node;
		while(temp != null && temp.next != null) {
			int k = temp.data;
			temp.data =temp.next.data;
			temp.next.data = k;
			temp = temp.next.next;
		}
	}
	
	public void piarWiseSwapRecursive(Node node) {
		
		Node temp = node;
		
		if(temp == null) {
			return;
		}
		
		if(temp != null && temp.next != null) {
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
		}
		piarWiseSwapRecursive(temp.next.next);
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
	
	public void printList(Node head) {
		
		while(head != null) {
			System.out.print(head.data+"->");
			head = head.next;
		}
	}

	
	public static void main(String[] args) {
		PairWiseSwap pairWiseSwap = new PairWiseSwap();
		pairWiseSwap.head = new Node(1);
		pairWiseSwap.append(2);
		pairWiseSwap.append(3);
		pairWiseSwap.append(4);
		pairWiseSwap.append(5);
		pairWiseSwap.append(6);
		
		pairWiseSwap.printList(pairWiseSwap.head);
		//pairWiseSwap.pairWiseSwap(pairWiseSwap.head);
		pairWiseSwap.piarWiseSwapRecursive(pairWiseSwap.head);
		System.out.println();
		pairWiseSwap.printList(pairWiseSwap.head);
		
		
	}
}

