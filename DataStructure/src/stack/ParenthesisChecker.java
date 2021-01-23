package stack;

public class ParenthesisChecker {
	
	static class Stack{
		int top = -1;
		char item[] = new char[100];
		
		void push(char x) {
			if(top == 99) {
				System.out.println("Stack is full");
			}else {
				item[++top] = x;
			}
		}
		
		
		char pop() {
			if(top<0) {
				System.out.println("Stack is Underflow");
				return '\0';
			}else {
				char element = item[top--];
				return element;
			}
		}
		
		boolean isEmpty() {
			return (top == -1)?true:false;
		}
	}
	
	public static boolean isMatchingPair(char ch1, char ch2) {
		
		System.out.println(ch1 +" ======= "+ ch2);
		if(ch1 == '(' && ch2 == ')' ) {
			return true;
		}else if(ch1 == '{' && ch2 == '}') {
			return true;
		}
		else if(ch1 == '[' && ch2 == ']') {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean areParenthesisBalanced(char exp[]) {
		Stack st = new Stack();
		for(int i=0; i<exp.length; i++) {
			if(exp[i] == '(' || exp[i] == '{' || exp[i] == '[') {
				st.push(exp[i]);
			}
			if(exp[i] == ')' || exp[i] == '}' || exp[i] == ']') {
				if(st.isEmpty()) {
					return false;
				}else if(!isMatchingPair(st.pop(), exp[i])) {
					return false;
				}
			}
		}
		
		if(st.isEmpty()) {
			return true; // balanced
		}else {
			return false; // not balanced
		}
	}
	
	public static void main(String[] args) {
		char[] exp = {'{', '(', ')', '}', '[', ')'};
		if(areParenthesisBalanced(exp)) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
	}

}
