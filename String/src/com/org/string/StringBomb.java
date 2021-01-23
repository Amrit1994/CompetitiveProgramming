package com.org.string;

import java.util.HashSet;
import java.util.Set;

public class StringBomb {

	public static void main(String[] args) {
		
		String str = "abbccd";
		char[] ch = str.toCharArray();
		String output = " ";
		Set<Character> charset = new HashSet<>();
		for(char c :ch){
			charset.add(c);
//			System.out.println(charset);
		}
		for(Character character: charset){
			System.out.print(character);
		}

	}

}
