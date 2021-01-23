package com.org.string;

import java.util.Scanner;

public class LongestString {
	public static void main(String [] args){
	Scanner sc  = new Scanner (System.in);
	String s = sc.nextLine();
	String [] str = s.split(" ");
	String longest = " ";
	String smallest = " ";
	for(int i = 0; i<str.length; i++){
		for(int j  = i+1; j<str.length; j++)
		{
			if(str[i].length()>=str[j].length())
			{
				longest = str[i];
			}
			
			 if(str[j].length()<str[i].length()){
				smallest = str[j];
			}
		}
	}
	System.out.println("Longest word from sentense is: " +longest);
	System.out.println(longest.length());
	
	System.out.println("Smallest word from sentense is: " +smallest);
	System.out.println(smallest.length());

}
}