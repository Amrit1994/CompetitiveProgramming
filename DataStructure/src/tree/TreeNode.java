package tree;

public class TreeNode {

		int data;
		int hd; // horizontal distance
		TreeNode left, right;
		TreeNode(int data){
			this.data = data;
			left = right = null;
			hd = Integer.MAX_VALUE;
		}
	
}
