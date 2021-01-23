package com.datastructure.linkedlist;

public class DeleteByPosition {
	
	Node head;
	
	public static class Node{
		Node next;
		int data;
		public Node(int data) {
			this.data = data;
			this.next= null;
			
		}
	}
	
	public void delete(int index) {
		Node temp, prev =null;
		temp = head;
		
		if(index ==0 && temp !=null) {
			temp = temp.next;
		}
		int counter = 0;
		while(temp != null) {
			if(counter == index) {
				prev.next= temp.next;
				System.out.println("found at = "+ index);
				break;
			}else {
				prev = temp;
				temp = temp.next;
				counter++;
			}
		}
		
		if(head == null) {
			System.out.println("Not Found");
		}
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data+" ");
			n =n.next;
		}
	}
	
	public static void main(String[] args) {
		
		DeleteByPosition deleteByPosition = new DeleteByPosition();
		deleteByPosition.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node four = new Node(40);
		Node five = new Node(50);
		
		deleteByPosition.head.next = second;
		second.next = third;
		third.next = four;
		four.next = five;
		deleteByPosition.printList();
		System.out.println();
		deleteByPosition.delete(2);
		System.out.println();
		deleteByPosition.printList();
		
		
	}

}
