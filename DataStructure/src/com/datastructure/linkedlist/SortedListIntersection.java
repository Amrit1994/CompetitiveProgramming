package com.datastructure.linkedlist;

public class SortedListIntersection {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void push(int data) {

		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;

	}

	// 1->2->3->4->5-null
	// 2->3->-5-6->null
	// return third list 2->3->5->null
	public void sortedIntersection(Node a, Node b) {
		// Node result = head;
		// Node result = head;
		// Node lastRef = result;
		// System.out.println(b.data);
		while (a != null && b != null) {
			if (a.data == b.data) {
				push(a.data);
				// System.out.println(a.data);
				// result = a;
				// result = result.next;
				a = a.next;
				b = b.next;
			} else if (a.data < b.data) {
				a = a.next;
				// System.out.println(a.data);
			} else {
				b = b.next;
				//System.out.println(b.data);
			}
		}
		// System.out.println("result == "+ result);
		// return head;
	}

	public void printList() {
		Node n = head;
		if (n == null) {
			System.out.println("NO");
		} else {

			while (n != null) {
				System.out.print(n.data + "->");
				n = n.next;
			}
		}
	}

	public static void main(String[] args) {
		SortedListIntersection intersection = new SortedListIntersection();

		intersection.push(5);
		intersection.push(4);
		intersection.push(3);
		intersection.push(2);
		intersection.push(1);

		SortedListIntersection intersection2 = new SortedListIntersection();
		intersection2.push(7);
		intersection2.push(6);
		intersection2.push(5);
		intersection2.push(4);
		intersection2.push(3);

		// intersection.printList();
		// System.out.println();
		// intersection2.printList(intersection2.head);
		// System.out.println();
		SortedListIntersection intersection3 = new SortedListIntersection();
		intersection3.sortedIntersection(intersection.head, intersection2.head);
		intersection3.printList();

	}
}
