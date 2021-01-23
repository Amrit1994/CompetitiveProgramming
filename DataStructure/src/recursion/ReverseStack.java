package recursion;

import java.util.Stack;

public class ReverseStack {

	static Stack<Character> st = new Stack<>();
	
	static void insert(char x) {
		if(st.isEmpty()) {
			st.push(x);
		}else {
			char ch = st.peek();
			st.pop();
			insert(x);
			st.push(ch);
		}
	}
	
	static void reverse() {
		if(st.size() > 0) {
			char ch = st.peek();
			st.pop();
			reverse();
			insert(ch);
		}
	}
	
	public static void main(String[] args)  
    { 
          
        // push elements into 
        // the stack 
        st.push('1'); 
        st.push('2'); 
        st.push('3'); 
        st.push('4'); 
          
        System.out.println("Original Stack"); 
          
        System.out.println(st); 
          
        // function to reverse  
        // the stack 
        reverse(); 
          
        System.out.println("Reversed Stack"); 
          
        System.out.println(st); 
    } 
}
