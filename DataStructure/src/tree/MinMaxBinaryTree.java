package tree;


class Node{
	int data;
	Node left, right;
	Node(int data){
		this.data = data;
		left = right =null;
	}
}
public class MinMaxBinaryTree {

	Node root;
	
	public MinMaxBinaryTree(int key){
		root = new Node(key);
	}
	
	public MinMaxBinaryTree() {
		root = null;
	}
	
	
	public static int findMax(Node root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
		int res = root.data;
		int lres = findMax(root.left);
		int rres = findMax(root.right);
		if(lres>res) {
			res = lres;
		}
		if(rres>res) {
			res = rres;
		}
		return res;
		
	}
	//pre-order traversal
	public static int findMin(Node root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		
		int res = root.data;
		int lres = findMin(root.left);
		int rres = findMin(root.right);
		if(lres<res) {
			res = lres;
		}
		if(rres<res) {
			res = rres;
		}
		return res;
		
	}
	
	public static void preorder(Node root) {
		if(root == null)return;
		System.out.print(root.data+ " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void inorder(Node root) {
		if(root == null)return;
		inorder(root.left);
		System.out.print(root.data+ " ");
		inorder(root.right);
	}
	
	public static void postorder(Node root) {
		if(root == null )return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+ " ");
	}
	
	public static void main(String[] args) {
		MinMaxBinaryTree binaryTree = new MinMaxBinaryTree();
		binaryTree.root = new Node(4);
		binaryTree.root.left = new Node(3);
		binaryTree.root.right = new Node(2);
		binaryTree.root.left.left = new Node(5);
		binaryTree.root.left.right = new Node(7);
		binaryTree.root.right.right = new Node(1);
		
		System.out.println("Maximum value Node== "+findMax(binaryTree.root));
//		System.out.println();
		System.out.println("Minimum value Node== "+findMin(binaryTree.root));
		System.out.print("preorder == ");
		preorder(binaryTree.root);
		System.out.print("inorder == ");
		inorder(binaryTree.root);
		System.out.print("postorder == ");
		postorder(binaryTree.root);
	}
}
