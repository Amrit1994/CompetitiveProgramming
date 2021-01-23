package com.org.string;

import java.util.LinkedList;
import java.util.Queue;

public class FindSubString {

	
	public static int lengthOfLongestSubstring(String s) {
		
		int length = 0;
		int size = 0;
		Queue<Character> queue = new LinkedList<Character>();
		
		//char[] ch = s.toCharArray();
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(queue.contains(ch)) {	
				char f = queue.poll();
				System.out.println(f+"=");
				length--;
				while(f != ch) {
					f = queue.poll();
					System.out.println(f+"==");
					length--;
				}
				
				queue.add(ch);
				length++;
			}else {
				queue.add(ch);
				length++;
			}
			
			size = Math.max(length, size);
		}
		
		return size;
	}
	
	
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
}
