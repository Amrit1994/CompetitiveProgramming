package com.gencode;

import java.util.HashSet;
import java.util.Set;

public class HCL {
	
	

	public static void main(String[] args) {
		
		String s = "AkashKumarGiri";
		char[] ch = s.toLowerCase().toCharArray();
		Set<Character> set = new HashSet<Character>();
		for(int i=0; i<ch.length; i++) {
			set.add(ch[i]);
		}
		for(Character c:set) {
		System.out.print(c);
		
		}
		System.out.println();
		
		String str  = "Hindustan Computer Ltd";
		String[] word = str.split(" ");
		for(int i=0; i<word.length; i++) {
			System.out.print(word[i].charAt(0));
		}
	}
}
