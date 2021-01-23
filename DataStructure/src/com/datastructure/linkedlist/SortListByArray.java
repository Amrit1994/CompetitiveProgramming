package com.datastructure.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class SortListByArray {

	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	
	public void push(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
		
	}
	
	public void sort(Node node, int N, int arr[]) {
		
		Map<Integer, Integer> map = new HashMap<>();
		Node temp = node;
		while(temp != null) {
			if(map.containsKey(temp.data)) {
				map.put(temp.data, map.get(temp.data)+1);
				temp = temp.next;
			}else {
				map.put(temp.data, 1);
				temp = temp.next;
				
			}
		}
		
		temp = node;
		
		for(int i=0; i<N; i++) {
			int frequency = map.get(arr[i]);
			while(frequency--!=0) {
				temp.data = arr[i];
				temp = temp.next;
			}
		}
		
		
	}
	
	public void printList(Node head) {
		
		Node n = head;
		while(n != null) {
			System.out.print(n.data+ " ");
			n= n.next;
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,1,3,2,8};
		int N = arr.length;
		SortListByArray sortListByArray = new SortListByArray();
		sortListByArray.head = new Node(3);
		sortListByArray.push(2);
		sortListByArray.push(5);
		sortListByArray.push(8);
		sortListByArray.push(5);
		sortListByArray.push(2);
		sortListByArray.push(1);
		
		sortListByArray.printList(sortListByArray.head);
		sortListByArray.sort(sortListByArray.head, N, arr);
		System.out.println();
		sortListByArray.printList(sortListByArray.head);
		
	}
}
