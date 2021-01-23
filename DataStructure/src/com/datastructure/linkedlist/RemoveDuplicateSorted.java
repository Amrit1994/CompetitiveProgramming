package com.datastructure.linkedlist;

public class RemoveDuplicateSorted {

	Node head;
	 public static class Node{
		 int data;
		 Node next;
		 public Node(int data) {
			 this.data = data;
			 next = null;
		 }
	 }
	 
	 
	 public void append(int data) {
		
		 Node n = head;
		 Node new_node = new Node(data);
		 if(head == null) {
			 head= new Node(data);
			 return;
		 }
		 new_node.next = null;
		 while(n.next != null) {
			 n = n.next;
		 }
		 n.next = new_node;
		 return;
	 }
	 
	 public Node removeDuplicate() {
		 
		 Node curr = head;
		 while(curr != null) {
			 Node temp = curr;
			 while(temp != null && temp.data == curr.data) {
				 temp = temp.next;
			 }
			 
			 curr.next = temp;
			 curr = curr.next;
		 }
		 
		 return head;
	 }
	 
	 
	 public void printList() {
		 Node n = head;
		 while(n != null) {
			 System.out.print(n.data+ " ");
			  n = n.next;
		 }
	 }
	 
	 public static void main(String[] args) {
		 
		 RemoveDuplicateSorted duplicateSorted = new RemoveDuplicateSorted();
		 duplicateSorted.append(20);
		 duplicateSorted.append(11);
		 duplicateSorted.append(20);
		 duplicateSorted.append(8);
		 duplicateSorted.append(9);
		 duplicateSorted.append(8);
		 
		 duplicateSorted.removeDuplicate();
		 duplicateSorted.printList();
		 
	 }
	 
}
