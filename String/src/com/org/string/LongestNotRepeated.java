package com.org.string;

import java.util.HashSet;
import java.util.Set;

public class LongestNotRepeated {
	
	public static String subString(String input){
		
		Set<Character> set = new HashSet<>();
		
		String longestOverAll="";
		String longestTillNow="";
		
		for(int i=0; i<input.length(); i++){
			char c = input.charAt(i);
			if(set.contains(c)){
				longestTillNow ="";
				set.clear();
			}
			longestTillNow += c;
			set.add(c);
			
			
			if(longestTillNow.length()>longestOverAll.length()){
				
				longestOverAll = longestTillNow;
			}
		}
		
		return longestOverAll;
		
	}
	
	public static void main(String args[])
	{
		String input = "substringfindout";
		System.out.println(subString(input));
	}

}
