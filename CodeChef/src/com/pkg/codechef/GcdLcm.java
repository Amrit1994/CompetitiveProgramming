package com.pkg.codechef;

import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t--!=0) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int x =a;
			int y =b;
			while(x!=y) {
			if(x>y) {
				x= x-y;
			}else {
				y = y-x;
			}
			}
			int lcm = a*b/x;
			 System.out.println(x +" "+ lcm);
		}
		scan.close();
	
	}
}
