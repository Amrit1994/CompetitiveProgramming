package com.datastructure.linkedlist;

import java.util.Scanner;
import java.util.Stack;

public class FindPalindrome {

	Node head;
	 public static class Node{
		 char data;
		 Node next;
		 public Node(char data) {
			 this.data = data;
			 next = null;
		 }
	 }
	 
	 
	 public void append(char data) {
		
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
	
	 
	 public void printList(Node head) {
		
	 }
	 
	 public static boolean isPalindrome(Node head) {
		 
		 Stack<Character> stack = new Stack<Character>();
		 while(head != null) {
			 stack.add(head.data);
			 head = head.next;
		 }
		 
		 
		  boolean ispalin = true;
		  char popped = stack.pop();
		 while(head!= null) {
			 if(head.data == popped) {
				 ispalin = true;
			 }else {
				 ispalin = false;
				 break;
			 }
			 head = head.next;
			 
		 }
		 
		 return ispalin;
	 }
	 
	 public static void main(String[] args) {
		 FindPalindrome findPalindrome = new FindPalindrome();
		 Scanner scan = new Scanner(System.in);
//		 int t
		 
		 
		 
		 findPalindrome.head = new Node('R');
		 findPalindrome.append('A');
		 findPalindrome.append('D');
		 findPalindrome.append('A');
		 findPalindrome.append('R');
		 System.out.println("is Palindrome== " +isPalindrome(findPalindrome.head));
	 }
	 
	 
}
