package com.pkg.codechef;

import java.util.Scanner;

public class ChefAndOperators {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of testcases");
		int n = sc.nextInt();
		while(n--!=0) {
		System.out.println("Enter  two inputs");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a<b) {
			System.out.println("<");
		}
		else if(a>b) {
			System.out.println(">");
		}
		else {
			System.out.println("=");
		}
		}	
	}

}
