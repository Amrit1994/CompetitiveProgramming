package recursion;

import java.util.Stack;

public class SortStack {

	public static Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(!s.isEmpty()){
		    
		    int temp = s.peek();
		    s.pop();
		    sort(s);
		    insert(s, temp);
		}
		return s;
	}
	
	static void insert(Stack<Integer> s, int temp){
	    if(s.isEmpty() || s.peek()<= temp){
	        s.push(temp);
	        return;
	    }else{
	        int val = s.peek();
	        s.pop();
	        System.out.println("temp: "+temp);
	        insert(s, temp);
	        System.out.println("val: "+val);
	        s.push(val);
	        
	    }
	}
	
	public static void main(String[] args) {
		/*Stack<Integer> st = new Stack<>();
		st.push(3);
		st.push(5);
		st.push(4);
		st.push(1);
		st.push(2);
		System.out.println("original: "+st);
		st = sort(st);
		System.out.println("sorted: "+st);*/
		
	}
}
