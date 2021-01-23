package com.pkg.codechef;

import java.util.Scanner;

public class ValidateTriangle {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();

		int result = 0;
		while(testcase-- != 0) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();         
		  result = a+b+c;
		if(result == 180) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

		}
		scan.close();
	}
}
