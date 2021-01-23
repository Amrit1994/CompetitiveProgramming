package recursion;

import java.util.Stack;

public class DeleteMiddleElement {

	static Stack<Integer> midElement(Stack<Integer> st, int size){
		if(st.isEmpty()) {
			return st;
		}else {
			int k = size/2 +1;
			solve(st, k);
			return st;
		}
	}
	
	static void solve(Stack<Integer> st, int k) {
		if(k == 1) {
			st.pop();
			return;
		}else {
			int temp = st.peek();
			st.pop();
			solve(st, k-1);
			st.push(temp);
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println("Before Delete "+st);
		st = midElement(st, st.size());
		System.out.println("After Delete "+st);
		
	}
}
