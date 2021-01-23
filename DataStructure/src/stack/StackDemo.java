package stack;

public class StackDemo {
	public static final int MAX = 100;
	int top;
	int a[] = new int[MAX];
	
	boolean isEmpty() {
		return (top<0);
	}
	
	StackDemo(){
		top = -1;
	}
	
	boolean push(int x) {
		if(top>=(MAX-1)) {
			System.out.println("Stack Overflow");
			return false;
		}else {
			a[++top] = x;
			System.out.println(x+" pushed into stack");
			return true;
		}
		
		
	}
	
	int pop() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}else {
			int x = a[top--];
			return x;
		}
	}
	
	int peek() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}else {
			int x = a[top];
			return x;
		}
	}

	public static void main(String[] args) {
		StackDemo stack = new StackDemo();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("--------------------------------");
		System.out.println(stack.pop()+ " popped from stack");
		
		System.out.println(stack.peek()+ " peeked from stack");
	}
}

