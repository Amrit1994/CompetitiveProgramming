package com.org.string;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {

		String a,b = "";
		Scanner sc = new Scanner(System.in);
		a= sc.nextLine();
		int n = a.length();
		for(int i=n-1; i>=0; i--){
			
			b += a.charAt(i);
		}
		if(a.equalsIgnoreCase(b)){
			System.out.println("this string is palindrome "+a);
		}
		else{
			System.out.println("This string is not palindrome "+a);
		}
		sc.close();
	}

}
