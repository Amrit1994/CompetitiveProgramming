package com.datastructure.linkedlist;

public class MoveLastToFirst {

	Node head;
	 static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	 
	 public void append(int data) {
		 Node new_node =new Node(data);
		 
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
	 
	 public void moveLastToFirst(Node node) {
		 
		 Node lastNode = node;
		 Node secondLast = null;
		 
		 while(lastNode.next != null) {
			 secondLast = lastNode;
			 lastNode = lastNode.next;
		 }
		 
		 secondLast.next = lastNode.next;
		 Node temp = lastNode;
		 temp.next = head;
		 head = temp;
	 }
	 
	 public void printList(Node node) {
		Node n = node;
		while(n != null) {
			System.out.print(n.data+"-> ");
			n = n.next;
		}
	 }
	 
	 public static void main(String[] args) {
		MoveLastToFirst lastToFirst = new MoveLastToFirst();
		lastToFirst.head = new Node(1);
		lastToFirst.append(2);
		lastToFirst.append(3);
		lastToFirst.append(4);
		lastToFirst.append(5);
		lastToFirst.printList(lastToFirst.head);
		lastToFirst.moveLastToFirst(lastToFirst.head);
		System.out.println();
		lastToFirst.printList(lastToFirst.head);
	}
}
