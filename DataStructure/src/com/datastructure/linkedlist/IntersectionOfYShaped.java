package com.datastructure.linkedlist;

public class IntersectionOfYShaped {

	Node headA, headB;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void addToTheLastList1(int data) {
		Node new_node = new Node(data);
//			
			new_node.next = null;
			Node last = headA;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		
	}
	
	public void addToTheLastList2(int data) {
		Node new_node = new Node(data);
			new_node.next = null;
			Node last = headB;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		
	}
	public void printList(Node node) {
		while(node != null) {
			System.out.println(node.data+ " ");
			node = node.next;
		}
	}
	
	int diff =0;
	public int intersectionOfTwoList(Node headA, Node headB) {
		
		Node current1 = headA;
		Node current2 = headB;
		//Node current = getintNode(headA, headB);
		//System.out.println("current = "+current.next.data);
		for(int i =0; i<diff; i++) {
			if(current1 == null) {
				return -1;
			}
			current1 = current1.next;
			
			
		}
		
		while(current1 != null && current2 != null) {
			if(current1.data == current2.data) {
				return current1.data;
			}
			current1 = current1.next;
			current2 = current2.next;
		}
		return -1;
	}
	
	
	public int getIntersectionNode(Node headA, Node headB) {
		int c1 = getNodeSize(headA);
		int c2 = getNodeSize(headB);
		if(c1>c2) {
			diff = c1-c2;
			return intersectionOfTwoList(headA, headB);
		}else {
			diff = c2 - c1;
			return intersectionOfTwoList(headB, headA);
		}
	}
	
	public int getNodeSize(Node node) {
		int count =0;
		Node current = node;
		
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		IntersectionOfYShaped list1 = new IntersectionOfYShaped();
		list1.headA = new Node(3);
		//list1.addToTheLast(3);
		list1.addToTheLastList1(6);
		list1.addToTheLastList1(9);
		list1.addToTheLastList1(15);
		list1.addToTheLastList1(30);
	//	list1.printList(list1.head);
		IntersectionOfYShaped list2 = new IntersectionOfYShaped();
		list2.headB = new Node(10);
		//list2.addToTheLast(10);
		list2.addToTheLastList2(15);
		list2.addToTheLastList2(30);
		
		IntersectionOfYShaped list3 = new IntersectionOfYShaped();
		System.out.println(list3.getIntersectionNode(list1.headA, list2.headB));
		
	}
	
}
