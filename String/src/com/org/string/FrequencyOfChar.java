package com.org.string;

import java.util.Scanner;

public class FrequencyOfChar {

	public static void main(String[] args) {
		int k;
		char ch, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scan.nextLine();
		for(c='A'; c<='z';c++){
			
			k=0;
			
		
		for(int j=0;j<str.length();j++){
			 ch= str.charAt(j);
			if(ch ==c){
				k++;
			}
		}
		
		if(k>0){
			System.out.println("The character " +c+ " has occured for "+k+ " times");
		}
		
	}
	scan.close();
 }

}
