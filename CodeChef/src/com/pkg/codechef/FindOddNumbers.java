package com.pkg.codechef;

import java.util.Scanner;

public class FindOddNumbers {
	
	public static void oddNo(int n)
	{
		
		if(n%2!=0){
			System.out.println(n+ ":"+ "is odd number");
		}
		else{
			System.out.println(n+ ":"+ "is an even number");
		}
			
		
		
		
	}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		oddNo(n);
		
	}

}
