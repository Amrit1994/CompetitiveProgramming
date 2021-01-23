package tree;

import java.util.LinkedList;
import java.util.Queue;

 class Node3 {
	int data;
	Node3 left, right;

	Node3(int data) {
		this.data = data;
		left = right = null;
	}
}

public class LevelorderBinaryTree {

	Node3 root;

	void printLevelOrder() {
		Queue<Node3> q = new LinkedList<Node3>();
		q.add(root);
		int res = root.data;
		int max = root.data;
		while(!q.isEmpty()) {
			Node3 tempNode = q.poll();
			 //res = tempNode.data;
			System.out.println(tempNode.data+ " ");
			if(tempNode.left != null) {
				q.add(tempNode.left);
				int lres = tempNode.left.data;
				
				// for min
				if(lres<res) {
					res = lres;
				}
				
				// for max
				if(lres>max) {
					max = lres;
				}
			}
			if(tempNode.right != null) {
				q.add(tempNode.right);
				int rres=tempNode.right.data;
				
				// for min
				if(rres<res) {
					res = rres;
				}
				
				// for max
				if(rres>max) {
					max = rres;
				}
				
			}
		}
		
		System.out.println("Minimum value == "+res);
		System.out.println("Maximum value == "+max);
	}

	
	public static void main(String[] args) {
		LevelorderBinaryTree binaryTree = new LevelorderBinaryTree();
		binaryTree.root = new Node3(1);
		binaryTree.root.left = new Node3(2);
		binaryTree.root.right = new Node3(3);
		binaryTree.root.left.left = new Node3(4);
		binaryTree.root.left.right = new Node3(5);
		System.out.println("Level Order Traversal of Binary Tree");
		binaryTree.printLevelOrder();
	}
}
