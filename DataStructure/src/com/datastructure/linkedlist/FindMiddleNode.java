package com.datastructure.linkedlist;

  

public class FindMiddleNode {
	Node head;
	
	public static class Node{
		Node next;
		int data;
		Node(int data){
			this.data =data;
			next = null;
		}
	}
	// insert at the front/beginning
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	
	// 1st approach
	public void findMiddle() {
		Node n = head;
		int counter =0;
		while(n!=null) {
			System.out.println(n.data+" ");
			n = n.next;
			counter++;
		}
		
		int mid = counter/2;
		System.out.println(mid);
		n = head;
		for(int i=0; i<=mid; i++) {
			if(i == mid) {
				System.out.println(n.data);
				break;
			}else {
				n = n.next;
			}
		}
		
	}
	
	
	// optimized approach
	public void printMiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		if(head !=null) {
			while(fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			System.out.println(slow_ptr.data);
		}
	}
	
	// print nth node
	public void printNthNode(int index) {
		Node n = head;
		int counter = 0;
		while(n!=null) {
			if(counter == index) {
				System.out.println(n.data);
				break;
			}else{
				n = n.next;
				counter++;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		FindMiddleNode findMiddleNode = new FindMiddleNode();
		findMiddleNode.head = new Node(10);
		findMiddleNode.push(20);
		findMiddleNode.push(30);
		findMiddleNode.push(40);
		findMiddleNode.push(50);
//		findMiddleNode.push(60);
		//findMiddleNode.findMiddle();
		//System.out.println("using two ptr");
		
		//findMiddleNode.printMiddle();
		findMiddleNode.printNthNode(0);
		
	}
}
