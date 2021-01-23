package tree;

class Node7 {
	int data;
	Node7 left, right;

	public Node7(int data) {
		super();
		this.data = data;
		left = right = null;
	}

}

public class HeightOfTree {

	Node7 root;

	public int findHeight(Node7 node) {

		if (node == null) {
			return -1;
		}
		return Math.max(findHeight(node.left), findHeight(node.right)) + 1;
	}

	int counter = 0;

	// 1st method
	public int sizeOfTree(Node7 node) {

		if (node == null) {
			return Integer.MIN_VALUE;
		}
		if (node != null) {
			counter++;
			sizeOfTree(node.left);
			sizeOfTree(node.right);
		}

		return counter;
	}
	
	// 2nd method
	public int size(Node7 node) {
		if(node == null) {
			return 0;
		}
		return (size(node.left)+1+size(node.right));
	}

	
	public int minDepth(Node7 node) {
		if(node == null) {
			return 0;
		}
		
		if(node.left == null && node.right == null) {
			return 1;
		}
		
		if(root.left == null) {
			return minDepth(node.right)+1;
		}
		if(root.right == null) {
			return minDepth(node.left)+1;
		}
		return Math.min(minDepth(node.left), minDepth(node.right))+1;
	}
	
	
	public int maxDepth(Node7 node) {
		if(node == null) {
			return 0;
		}
		if(node.left == null && node.right == null) {
			return 1;
		}
		
		if(node.left == null) {
			return minDepth(node.right);
		}
		if(node.right == null) {
			return minDepth(node.left);
		}
		
		return Math.max(minDepth(node.left), minDepth(node.right))+1;
				
	}
	
	public static void main(String[] args) {
		HeightOfTree tree = new HeightOfTree();
		tree.root = new Node7(6);
		tree.root.left = new Node7(4);
		tree.root.right = new Node7(3);
		tree.root.left.right = new Node7(5);
		tree.root.left.left = new Node7(8);
		tree.root.right.left = new Node7(11);
		tree.root.right.right = new Node7(34);
		tree.root.left.left.right = new Node7(33);
		System.out.println("Height of tree is == " + tree.findHeight(tree.root));
	
		System.out.println("Size of tree is == "+ tree.sizeOfTree(tree.root));
		
		System.out.println("Size of tree is == "+ tree.size(tree.root));
		
		System.out.println("Min Depth of Binary Tree == "+ tree.minDepth(tree.root));
	
		System.out.println("Max Depth of Binary Tree == "+ tree.maxDepth(tree.root));

	}

}
