package tree;


class Node6{
	int data;
	Node6 left, right;
	
	Node6(int data){
		this.data = data;
		left = right = null;
	}
}
public class CheckBST {

	Node6 root;
	//Node6 prev;
	
	public boolean isBST(Node6 node, Node6 prev) {
		
		if(node != null) {
		
		if(!isBST(node.left, prev)) {
			return false;
		}
		if(prev != null && node.data<=prev.data) {
			return false;
		}
		
		prev = node;
		return isBST(node.right, prev);
		}
		return true;
	}
	
	
	boolean isBST() {
		Node6 prev = null;
		return isBST(root, prev);	
	}
	
	public static void main(String[] args) {
		CheckBST bst = new CheckBST();
		bst.root = new Node6(8);
		bst.root.left = new Node6(5);
		bst.root.right = new Node6(10);
		bst.root.left.left = new Node6(4);
		bst.root.left.left.right = new Node6(6);
		bst.root.right.left = new Node6(9);
		bst.root.right.right = new Node6(11);
		System.out.println(bst.isBST());
	}
}
