package tree;

class Node2 {
	int data;
	Node2 left, right;

	Node2(int data) {
		this.data = data;
		left = right = null;

	}
}

public class LeafNode {

	Node2 root;
	int count = 0;
	int a =0;
	int  b= 0;
	public int countOfLeafNode(Node2 n) {

		
		if (n == null) {
			return 0;
		}
		if (n.left == null && n.right == null) {
			//count++;
			return 1;
		} else {

			 return countOfLeafNode(n.left)+ countOfLeafNode(n.right);

			 //b = countOfLeafNode(n.right);
			 //return a+b;
		}
		//System.out.println(a + " "+ b);

		//return count;
	}

	//int count = 0;
	public int countLeafNode(Node2 node) {
		
		if(node == null) {
			return 0;
		}
		if(node.left == null && node.right == null) {
			count = count+1;
//			return 1;
		}
		
		 countLeafNode(node.left);
		 countLeafNode(node.right);
		return count;
	}      
	public static void main(String[] args) {

		LeafNode binaryTree = new LeafNode();
		binaryTree.root = new Node2(10);
		binaryTree.root.left = new Node2(3);
		binaryTree.root.right = new Node2(4);
		binaryTree.root.left.left = new Node2(2);
		binaryTree.root.left.right = new Node2(7);
		binaryTree.root.right.right = new Node2(1);
		System.out.println("Leaf Node count == " + binaryTree.countOfLeafNode(binaryTree.root));
		
//		System.out.println("Leaf Node count == "+ binaryTree.countLeafNode(binaryTree.root));
	}
}
