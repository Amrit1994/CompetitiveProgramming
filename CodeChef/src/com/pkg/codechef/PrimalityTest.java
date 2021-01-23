package com.pkg.codechef;

import java.util.Scanner;

public class PrimalityTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//int arr[] = new int[n];
		while(n--!=0){
			boolean flag = false;
			int num = scan.nextInt();
			for(int j=2; j*j<=num; j++) {
				if(num%j== 0) {
					flag = true;
					break;
				}else {
					flag=false;
				}
			}
			
			if(flag) {
				System.out.println("no");
			}else {
				System.out.println("yes");
			}
		}
		scan.close();
	}
}
