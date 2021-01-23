package tree;

public class InsertBinarySearchTree {

	BstNode root;
	static class BstNode{
		int key;
		BstNode left, right;
		
		public BstNode(int data){
			key = data;
			left = right = null;
		}
	}
	
	public InsertBinarySearchTree() {
		root = null;
		}
	
	public void insert(int key) {
		root = insertRec(root, key);
	}
	
	public BstNode insertRec(BstNode root, int data) {
		
		if(root == null) {
			root = new BstNode(data);
			return root;
		}
		if(data < root.key) {
			root.left = insertRec(root.left, data);
		}else if(data> root.key) {
			root.right = insertRec(root.right, data);
		}
		return root;
	}
	
	
	public void Inorder() {
		InorderRec(root);
	}
	
	public void InorderRec(BstNode root) {
		if(root == null) return ;
		
		InorderRec(root.left);
		System.out.print(root.key+" ");
		InorderRec(root.right);
	}
	
	
	public void preorder() {
		preorderRec(root);
	}
	
	public void preorderRec(BstNode root) {
		if(root == null) return;
		System.out.println(root.key+ " ");
		preorderRec(root.left);
		preorderRec(root.right);
	}
	
	public void postorder() {
		postorderRec(root);
	}
	
	public void postorderRec(BstNode root) {
		if(root == null) return;
		postorderRec(root.left);
		postorderRec(root.right);
		System.out.println(root.key+ " ");
	}
	
	public static void main(String[] args) {
		
		InsertBinarySearchTree binarySearchTree = new InsertBinarySearchTree();
		binarySearchTree.insert(50);
		binarySearchTree.insert(30);
		binarySearchTree.insert(20);
		binarySearchTree.insert(40);
		binarySearchTree.insert(70);
		binarySearchTree.insert(60);
		binarySearchTree.insert(80);
		//binarySearchTree.insert(50);
		//binarySearchTree.Inorder();
//		binarySearchTree.preorder();
		binarySearchTree.postorder();
		
	}
}
