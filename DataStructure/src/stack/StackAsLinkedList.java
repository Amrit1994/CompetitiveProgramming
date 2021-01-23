package stack;

public class StackAsLinkedList {

	StackNode root;
	
	static class StackNode{
		int data;
		StackNode next;
		public StackNode() {
			this.data = data;
		}
	}
	
	public boolean isEmpty() {
		if(root == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(int data) {
		StackNode newNode = new StackNode();
		if(root == null) {
			root = newNode;
		}
		else {
			StackNode temp = root;
			newNode.next = temp;
			root = newNode;
			//newNode.next = temp;
		}
		
		System.out.println(data+ " Pushed to Stack");
	}
	
	public  void printStack() {
		StackNode node = root;
		System.out.println(node.data);
		while(node!= null) {
			System.out.print("stack data== "+ node.data);
			node = node.next;
		}
	}
	
	
	public int pop() {
		int popped = Integer.MIN_VALUE;
		if(root == null) {
			System.out.println("Stack is UnderFlow");
			return 0;
		}
		else {
			popped = root.data;
			root = root.next;
			return popped;
		}
	}
	
	
	public int peek() {
		if(root == null) {
			System.out.println("Stack is empty");
			return Integer.MIN_VALUE;
		}
		else {
			return root.data;
		}
	}
	
	public static void main(String[] args) {
		StackAsLinkedList sl  = new StackAsLinkedList();
		sl.push(10);
		sl.push(20);
		sl.push(30);
		sl.push(40);
		sl.push(50);
		
		sl.printStack();
		
		System.out.println(sl.isEmpty());
		System.out.println(sl.pop()+ " popped from stack");
		System.out.println(" Top element in stack "+ sl.peek());
	}
}
