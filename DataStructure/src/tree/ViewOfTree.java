package tree;

import java.util.LinkedList;
import java.util.Queue;

class Node8 {
	int data;
	Node8 left, right;

	public Node8(int data) {
		this.data = data;
		left = right = null;
	}
}

public class ViewOfTree {

	Node8 root;
	static int max_level = 0;

	// recursive approach
	public void leftViewOfTree(Node8 node, int level) {

		
		if (node == null) {
			return;
		}

		if (max_level < level) {
//			System.out.println("level== " + level);
			System.out.println(" " + node.data);
			max_level = level;
		}

		leftViewOfTree(node.left, level + 1);
		leftViewOfTree(node.right, level + 1);
	}

	public void leftView() {
		leftViewOfTree(root, 1);
	}

	// iterative approach
	int sum = 0;
	public void leftViewIterative(Node8 node, int level) {

		if (root == null) {
			return;
		}

		Queue<Node8> queue = new LinkedList<Node8>();
		queue.add(root);
		while (!queue.isEmpty()) {

			int size = queue.size();
			int i = 0;

			while (i++ < size) {

				Node8 tempNode = queue.poll();
				if (i == 1) {
					System.out.print(" " + tempNode.data+" ");
					System.out.println();
					//max_level = level;
					sum += tempNode.data;
				}
				if (tempNode.left != null) {
					queue.add(tempNode.left);
					//level = level + 1;
				}

				if (tempNode.right != null) {
					queue.add(tempNode.right);
					//level = level + 1;
				}
			}
		}
		System.out.println("sum of leftview == "+ sum);
	}

	public void leftViewIterative() {
		leftViewIterative(root, 1);
	}

	
	// right view of tree recursively
	public void rightView(Node8 node, int level) {
		
		if(node == null) {
			return;
		}
		if(max_level< level) {
//			System.out.println(max_level +" < "+ level);
//			System.out.println();
			System.out.print(" "+  node.data);
			max_level = level;
		}
		rightView(node.right, level+1);
		rightView(node.left, level+1);
		
	}
	
	public void rightView() {
		rightView(root, 1);
	}
	
	
	
	// right view iterative
	public void rightViewIterative(Node8 node, int level) {
		if(node == null) {
			return;
		}
		Queue<Node8> queue = new LinkedList<Node8>();
		queue.add(node);
		while(!queue.isEmpty()) {
			int counter = 0;
			int size = queue.size();
			System.out.println("size == "+ size);
			
			while(counter < size) {
				Node8 tempNode = queue.poll();
				if(counter+1 == size) {
					System.out.println(" "+tempNode.data);
				}
				if(tempNode.left != null) {
					queue.add(tempNode.left);
					
				}
				if(tempNode.right != null) {
					queue.add(tempNode.right);
					
				}
				
				counter++;
			}
			
		}
		
	}
	
	public void rightViewIterative() {
		rightViewIterative(root, 1);
	}
	
	
	public static void main(String[] args) {
		ViewOfTree tree = new ViewOfTree();
		tree.root = new Node8(6);
		tree.root.left = new Node8(4);
		tree.root.right = new Node8(3);
		tree.root.left.right = new Node8(5);
		tree.root.left.left = new Node8(8);
		tree.root.right.left = new Node8(11);
		tree.root.right.right = new Node8(34);
		tree.root.left.left.right = new Node8(33);
//		tree.leftView();
		tree.leftViewIterative();
		//tree.rightView();
		//tree.rightViewIterative();
	}

}
