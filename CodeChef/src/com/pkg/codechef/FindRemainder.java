package com.pkg.codechef;

import java.util.Scanner;

public class FindRemainder {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			int k = sc.nextInt();
			int t  = sc.nextInt();
			int r = k%t;
			System.out.println(r);
		}
		
	}

}
