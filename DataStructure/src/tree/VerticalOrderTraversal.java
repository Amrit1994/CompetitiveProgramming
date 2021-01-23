package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class VerticalOrderTraversal {

	TreeNode root;



	//using level-order printing bottom view
	public void bottomViewByLevelOrder() {
		if(root == null) {
			return;
		}
		int hd = 0;
		
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Map<Integer, Integer> map = new TreeMap<>();
		root.hd = hd;
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode tempNode = queue.poll();

			hd = tempNode.hd;
			map.put(hd, tempNode.data);
			if (tempNode.left != null) {
				tempNode.left.hd = hd - 1;
				queue.add(tempNode.left);
				
			}
			if (tempNode.right != null) {
				tempNode.right.hd = hd + 1;
				queue.add(tempNode.right);
			

			}
			// size--;
			// }

		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

	// using preorder traversal
	public void verticalOrder(TreeNode node, int hd, HashMap<Integer, ArrayList<Integer>> map) {
		if (node == null) {
			return;
		}
		// System.out.println(map.get(hd));
		ArrayList<Integer> arrlist = map.get(hd);
		if (arrlist == null) {
			arrlist = new ArrayList<Integer>();
			arrlist.add(node.data);

		} else {
			arrlist.add(node.data);
		}
		map.put(hd, arrlist);
		verticalOrder(node.left, hd - 1, map);
		verticalOrder(node.right, hd + 1, map);

	}

	public void printVerticalOrder() {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		int hd = 0;
		verticalOrder(root, hd, map);
		map.forEach((k, v) -> System.out.println(k + "  " + v));
	}

	public void printBottomView() {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		HashMap<Integer, ArrayList<Integer>> sorted = new HashMap<Integer, ArrayList<Integer>>();
		int hd = 0;
		verticalOrder(root, hd, map);

		sorted = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println(sorted);
	}
	
	public void topView() {
		if(root == null) {
			return;
		}
		int hd = 0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		Map<Integer,Integer> map = new TreeMap<>();
		root.hd = hd;
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode temp = q.poll();
			
			hd = temp.hd;
			if(!map.containsKey(hd)) {
				map.put(hd, temp.data);
			}
			
			if(temp.left != null) {
				temp.left.hd = hd-1;
				q.add(temp.left);
			}
			if(temp.right != null) {
				temp.right.hd = hd+1;
				q.add(temp.right);
			}
			
			
		}
		
		map.forEach((k,v)->System.out.print(v+ " "));
	}
	
	

	public static void main(String[] args) {
		VerticalOrderTraversal traversal = new VerticalOrderTraversal();
		traversal.root = new TreeNode(1);
		traversal.root.left = new TreeNode(2);
		traversal.root.right = new TreeNode(3);
		traversal.root.left.left = new TreeNode(4);
		traversal.root.left.right = new TreeNode(5);
		traversal.root.right.left = new TreeNode(6);
		traversal.root.right.right = new TreeNode(7);
		//traversal.bottomViewByLevelOrder();
		//traversal.printVerticalOrder();
		//traversal.printBottomView();
		traversal.topView();
	}
}
