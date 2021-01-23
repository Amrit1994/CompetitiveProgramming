package com.pkg.codechef;

import java.util.Scanner;

public class GreedyPuppy {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int max = Integer.MIN_VALUE;
			int N = scan.nextInt();
			int K = scan.nextInt();
			for(int i =1; i<=K; ++i) {
			int remainder = N%i;
			if(remainder>max) {
				max = remainder;
			}
			
			}
			System.out.println(max);
		}
		scan.close();
	}

}
