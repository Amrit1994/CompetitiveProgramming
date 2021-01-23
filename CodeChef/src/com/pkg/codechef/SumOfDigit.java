package com.pkg.codechef;

import java.util.Scanner;

public class SumOfDigit {
	
	
	public static int digit(int n){
//		int k = 0;
		
			if(n/10==0){
			return n;
		}
		// by recursion
		return ((n%10)+digit(n/10));
		}
	
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k;
//		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			
			 k = sc.nextInt();
			 System.out.println(digit(k));
		}
		
	}

}
