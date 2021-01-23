package com.datastructure.linkedlist;

public class SwapLinkedList {

	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			head = new Node(new_data);
		}
		new_node.next = head;
		head = new_node;
	}
	
	
	public void swapNodes(int x, int y) {
		
		Node prevX = null, currX = head;
		if(x == y) {
			return;
		}
		
		while(currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}
		
		Node prevY = null, currY = head;
		while(currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}
		
		if(currX == null || currY == null) {
			return;
		}
		
		if(prevX != null) {
			prevX.next = currY;
		}else {
			head = currY;
		}
		
		if(prevY != null) {
			prevY.next = currX;
		}else {
			head = currX;
		}
		
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}
	
}
