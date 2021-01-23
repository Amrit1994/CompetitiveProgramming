package com.pkg.codechef;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			int k= sc.nextInt();
			int s= (int)Math.sqrt(k);
			System.out.println(s);
		}

	}

}
