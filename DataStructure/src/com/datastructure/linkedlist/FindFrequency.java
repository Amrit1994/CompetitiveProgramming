package com.datastructure.linkedlist;

public class FindFrequency {

	Node head;

	public static class Node {
		Node next;
		int data;

		public Node(int data) {
			this.next = null;
			this.data = data;
		}
	}

	public void insertAtLast(int new_data) {
		Node new_node = new Node(new_data);
		Node last = head;
		if (last == null) {
			last = new Node(new_data);
		}
		new_node.next = null;
		while (last.next != null) {
			last = last.next;
		}

		last.next = new_node;
		return;
	}

	public int findFrequency(int key) {
		Node n = head;
		int count = 0;
		while (n != null) {
			if (n.data == key) {
				count++;
			} 
				n = n.next;

		}
		return count;
	}
	
	public static void main(String[] args) {
		FindFrequency findFrequency = new FindFrequency();
		findFrequency.head = new Node(10);
		findFrequency.insertAtLast(20);
		findFrequency.insertAtLast(20);
		findFrequency.insertAtLast(20);
		findFrequency.insertAtLast(30);
		findFrequency.insertAtLast(40);
		System.out.println(findFrequency.findFrequency(30));
	}
}
