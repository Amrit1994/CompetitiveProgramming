package com.datastructure.linkedlist;

public class OptimizedPalindrome {

	Node head;
	Node second_start;

	static class Node {
		char data;
		Node next;

		public Node(char data) {
			this.data = data;
			next = null;
		}
	}

	public void append(char new_data) {

		Node new_node = new Node(new_data);

		if (head == null) {
			head = new Node(new_data);
			// return;
		}
		new_node.next = null;
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}

		last.next = new_node;
		// return;
		// new_node = head;
	}

	public boolean isPalindrome(Node head) {

		Node slow_ptr = head;
		Node fast_ptr = head;
		// Node second_start = null;
		Node prev_of_slow_ptr = head;
		//Node midnode = null;
		boolean isPalin = true;
		if (head != null && head.next != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				prev_of_slow_ptr = slow_ptr;
				slow_ptr = slow_ptr.next;
			}

			printList(prev_of_slow_ptr);
			// for odd linked list
			if (fast_ptr != null) {
				//midnode = slow_ptr;
				slow_ptr = slow_ptr.next;
			}
			second_start = slow_ptr;
			//printList(second_start);
			prev_of_slow_ptr.next = null;

			reverse();
			isPalin = compare(head, second_start);
			//reverse();
			/*
			 * if (midnode != null) { prev_of_slow_ptr.next = midnode; midnode.next =
			 * second_start; } else { prev_of_slow_ptr.next = second_start; }
			 */
			//System.out.println(isPalin);
		}
		return isPalin;
	}

	public void reverse() {

		Node current = second_start;
		Node prev = null;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		second_start = prev;
		//return prev;
	}

	public static boolean compare(Node n1, Node n2) {

		Node temp1 = n1;
		Node temp2 = n2;

		while (temp1 != null && temp2 != null) {
			if (temp1.data == temp2.data) {
				temp1 = temp1.next;
				temp2 = temp2.next;
			} else {
				return false;
			}
		}

		if (temp1 == null && temp2 == null) {
			return true;
		}
		return false;
	}

	public void printList(Node head) {
		while (head != null) {
			System.out.println(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		OptimizedPalindrome optimizedPalindrome = new OptimizedPalindrome();
		optimizedPalindrome.head = new Node('a');
		optimizedPalindrome.append('b');
		optimizedPalindrome.append('a');
		optimizedPalindrome.append('d');
		optimizedPalindrome.append('a');
		optimizedPalindrome.append('b');
		optimizedPalindrome.append('a');
		//optimizedPalindrome.printList(optimizedPalindrome.head);
		if (optimizedPalindrome.isPalindrome(optimizedPalindrome.head)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}
}
