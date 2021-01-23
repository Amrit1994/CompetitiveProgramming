package com.pkg.codechef;

import java.util.Scanner;

public class DECINC {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n%4 == 0) {
			n = n+1;
		}else {
			n = n-1;
		}
		
		System.out.println(n);
		scan.close();
	}

}
