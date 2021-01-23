package com.org.string;

import java.util.Scanner;

 class FinalReverse {

	public static void reverse(String input){
		
		String[] words = input.split(" ");
		int length = words.length;
		StringBuilder finalString  = new StringBuilder(input.length());
		for(int i=length-1; i>=0; i--)
		{
			finalString.append(words[i]);
			finalString.append(" ");                  
		}
		System.out.println(" Result String: " +finalString.toString());
	}
}

class ReverseString{
	public static void main(String[] args){
		FinalReverse obj = new FinalReverse();
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		obj.reverse(input);
		
		
	}
}