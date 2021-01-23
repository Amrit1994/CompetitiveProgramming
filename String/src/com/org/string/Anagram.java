package com.org.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagram {
	public static void main(String...args)throws IOException{
		
//		String str1 = "Mother In Law";
//		String str2 = "Hitler Woman";
		BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
		String str1 = sb.readLine().trim();
		String str2 = sb.readLine().trim();
		System.out.println(CheckAnagram(str1, str2));
	}
	
	
	public static boolean CheckAnagram(String str1, String str2){
		
		String rmstr1 = str1.replaceAll("\\s", "");  // remove whitespace
		String rmstr2 = str2.replaceAll("\\s", "");
		
		if(rmstr1.length()!=rmstr2.length()){
			
			System.out.println("String lengths are not same");
			return false;
			
		}
		else{
		char[] ch1 = rmstr1.toLowerCase().toCharArray();
		char[] ch2 = rmstr2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
	
		return Arrays.equals(ch1, ch2);
	}
	}
	
	

}
