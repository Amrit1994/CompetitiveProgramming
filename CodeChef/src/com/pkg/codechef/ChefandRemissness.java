package com.pkg.codechef;

import java.util.Scanner;

public class ChefandRemissness {

	public static void main(String[] args) {
		int p=0,q=0,r=0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0; i<n; i++){
			 p = scan.nextInt();
			 q = scan.nextInt();
			 System.out.println(Math.max(p, q)+" "+(p+q));
		}
		
		

	}

}
