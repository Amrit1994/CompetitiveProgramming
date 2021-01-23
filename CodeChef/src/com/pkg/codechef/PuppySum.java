package com.pkg.codechef;

import java.util.Scanner;

public class PuppySum {

	public static int sum(int d, int n) {
		int sum =0;
		if(d>1) {
			while(d--!=0) {
			 sum =0;
				for(int i=1; i<=n; i++) {
					 sum = sum+i;
				}
				n =sum;
			}
		}else {
			for(int i=1; i<=n; i++) {
				 sum = sum+ i;
				
			}
		}
		return sum;
	} 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t--!=0) {
		int d = scan.nextInt();
		int n = scan.nextInt();
		int sol = sum(d,n);
		System.out.println(sol);
		}
		scan.close();
	}
}
