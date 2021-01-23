package tree;

public class MinMaxInBST {

	Node5 root;
	

	 static class Node5{
		int data;
		Node5 left, right;
		Node5(int data){
			this.data = data;
			left = right = null;
					
		}
	}
	 
	 
	 public int findMin(Node5 node) {
		 
		 if(node == null) {
			 return Integer.MAX_VALUE;
		 }
		 
		 int res = node.data;
		 int lres = findMin(node.left);
		 if(lres<res) {
			 res = lres;
		 }
		 return res;
	 }
	 
	 public int findMax(Node5 node) {
		 if(node == null) {
			 return Integer.MIN_VALUE;
		 }
		 int res = node.data;
		 int rres = findMax(node.right);
		 if(rres>res) {
			 res = rres;
		 }
		 
		 return res;
	 }
	 
	 public void preorder(Node5 n) {
		 if(n == null) return;
		 System.out.print(n.data+ " ");
		 preorder(n.left);
		 preorder(n.right);
	 }
	 
	 public static void main(String[] args) {
		 MinMaxInBST binaryTree = new MinMaxInBST();
		binaryTree.root = new Node5(10);
		binaryTree.root.left = new Node5(8);
		binaryTree.root.right = new Node5(12);
		binaryTree.root.left.left = new Node5(7);
		binaryTree.root.left.right = new Node5(9);
		binaryTree.root.right.left = new Node5(11);
		binaryTree.root.right.right = new Node5(13);
		System.out.println("Min In Binary Tree == "+ binaryTree.findMin(binaryTree.root));
		System.out.println("Max In Binary Tree == "+ binaryTree.findMax(binaryTree.root));
		binaryTree.preorder(binaryTree.root);
	 }
}
