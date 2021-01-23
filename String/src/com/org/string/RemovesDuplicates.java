package com.org.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemovesDuplicates {
	public static void main(String...args){
		
//		String s = "abbcddeeff";
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
//		String str = s.replaceAll("\\s", ""); // removing white space from string
//		System.out.println(str);
		char[] ch = s.toCharArray();
		Set<Character> charSet = new HashSet<>();
		for(char c: ch){
			
			charSet.add(c);	
		}
		
//		StringBuffer sb = new StringBuffer();
		for(Character character : charSet){
//			sb.append(character);
			System.out.print(character);
		}
//		System.out.println(sb.toString());
		
	}

}
