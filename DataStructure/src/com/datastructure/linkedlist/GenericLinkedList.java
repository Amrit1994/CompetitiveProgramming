package com.datastructure.linkedlist;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
		this.data = d;
		this.next = null;
	}
}


public class GenericLinkedList {
	Node head;
	
	public void addToTheLast(Node node){
		if(head == null){
			head = node;
		}
		else{
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public static void main(String[] args){
//		xint value;
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t>0){
			int n  = scan.nextInt();
			
			GenericLinkedList glist = new GenericLinkedList();
			int a1 = scan.nextInt();
			Node head = new Node(a1);
			glist.addToTheLast(head);
			
			for(int i=1; i<n; i++){
				int a = scan.nextInt();
				glist.addToTheLast(new Node(a));
			}
			TraverseList  tlist = new TraverseList();
			tlist.printList(glist.head);
			System.out.println();
			t--;
		}
		scan.close();
	}

}

class TraverseList{
	
	void printList(Node head){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+ " ");
			n = n.next;
		}
	}
	
}
