package com.datastructure.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class DetectLoop {

	Node head;

	public static class Node {
		Node next;
		int data;

		public Node(int data) {
			this.next = null;
			this.data = data;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new Node(new_data);
		}
		new_node.next = head;
		head = new_node;

	}
	
	public boolean detectLoop(Node head) {
		Set<Node> set = new HashSet<Node>();
		while(head != null) {
			if(set.contains(head)) {
				return true;
			}
			
			set.add(head);
			head = head.next;
		}
		return false;
	}
	
	public boolean detectLoopUtilizeMethod(Node head) {
		
		Node slow_ptr = head;
		Node fast_ptr = head;
		while(slow_ptr != null && fast_ptr != null && fast_ptr.next != null) {
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
			if(slow_ptr == fast_ptr) {
				return true;
			}
		}
		return false;
	}
	
	public static int countLoopNodes(Node n) {
		int counter = 1;
		Node temp = n;
		while(temp.next != n) {
			counter++;
			temp = temp.next;
		}
		return counter;
	}
	
	
	public int detectAndCountLoop(Node head) {
		Node slow_ptr = head;
		Node fast_ptr = head;
		while(slow_ptr != null && fast_ptr != null && fast_ptr.next != null){
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
			if(slow_ptr == fast_ptr) {
				return countLoopNodes(slow_ptr);
			}
		}
		return 0;
	}
	
	public boolean detectAndRemoveLoop(Node head) {
		Node slow_ptr = head;
		Node fast_ptr = head;
		while(slow_ptr != null && fast_ptr != null && fast_ptr.next != null) {
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
			if(slow_ptr == fast_ptr) {
				removeLoop(slow_ptr, head);
				return true;
			}
		}
		return false;
	}
	
	public static void removeLoop(Node slow_ptr, Node head) {
		System.out.println("====");
		while(slow_ptr.next != head.next) {
			slow_ptr = slow_ptr.next;
			head = head.next;
		}
		slow_ptr.next = null;
	}
	
	
	// 2nd method
	public static void detectAndRemove(Node head) {
		Node slow = head;
		Node fast = head;
		while(slow != null && fast != null && fast.next != null) {
			if(slow == fast) {
				break;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(slow == fast) {
			while(slow.next != fast.next) {
				slow = slow.next;
				fast = fast.next;
			}
			fast.next = null;
		}
	}
	
	public void printList() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		DetectLoop detectLoop = new DetectLoop();
		detectLoop.head = new Node(10);
		detectLoop.push(20);
		detectLoop.push(30);
		detectLoop.push(40);
		detectLoop.push(20);
		detectLoop.printList();
		
		detectLoop.head.next.next.next.next.next = detectLoop.head.next;
		
		//detectLoop.printList();
		if(detectLoop.detectLoopUtilizeMethod(detectLoop.head)) {
			System.out.println("Loop Found");
		}else {
			System.out.println("Loop Not Found");
		}
		
		System.out.println("Loop Count == "+ detectLoop.detectAndCountLoop(detectLoop.head));
		
//		if(detectLoop.detectAndRemoveLoop(detectLoop.head)) {
//		System.out.println("Remove Loop");
//		
//		}else {
//			System.out.println("Not remove");
//		}
//		detectLoop.printList();
		
		detectAndRemove(detectLoop.head);
		detectLoop.printList();
	}
}
