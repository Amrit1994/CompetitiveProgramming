package com.datastructure.linkedlist;

import java.util.HashSet;

public class RemoveDuplicateUnsorted {

	Node head;
	 
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	
	public void push(int data) {
		
		Node new_node = new Node(data);
		if(head == null) {
			head = new Node(data);
		}
		
		new_node.next = head;
		head= new_node;
		
	}
	
	
	// hashing approach (optimized)
	public void removeDuplicates() {
		HashSet<Integer> hashSet  = new HashSet<Integer>();
		Node curr = head;
		Node prev = null;		
		while(curr != null) {
			int currvalue = curr.data;
			
			if(hashSet.contains(currvalue)) {
				prev.next = curr.next; 
			}else {
				hashSet.add(currvalue);
				prev = curr;
			}
			curr = curr.next;
		}
	}
	
	// take two loop
	public void removeDuplicates(Node head) {
		Node curr = head;
		Node prev= null;
		while(curr != null && curr.next != null) {
			prev = curr;
			while(prev.next != null) {
				if(curr.data == prev.next.data) {
					
					prev.next = prev.next.next;
				}else {
					prev = prev.next;
				}
			}
			curr = curr.next;
		}
	}
	
	public void printList() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+ " ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		RemoveDuplicateUnsorted duplicateUnsorted = new RemoveDuplicateUnsorted();
		duplicateUnsorted.push(10);
		duplicateUnsorted.push(12);
		duplicateUnsorted.push(11);
		duplicateUnsorted.push(11);
		duplicateUnsorted.push(12);
		duplicateUnsorted.push(11);
		duplicateUnsorted.push(10);
		duplicateUnsorted.printList();
		System.out.println();
		//duplicateUnsorted.removeDuplicates();
		duplicateUnsorted.removeDuplicates(duplicateUnsorted.head);
		duplicateUnsorted.printList();
		
	}
}
