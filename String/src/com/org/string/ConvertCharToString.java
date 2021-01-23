package com.org.string;

public class ConvertCharToString {
	public static void main(String[] args) {
		char[] ch = {'a', 'b', 'c', 'd', 'e'};
		//System.out.println(ch.toString());
		String str = new String(ch);
		String s = String.valueOf(ch);
//		String st = Character.;
		
//		for(int i=0; i<ch.length; i++) {
//			str += str.charAt(i);
//		}
		System.out.println(s);
	}

}
