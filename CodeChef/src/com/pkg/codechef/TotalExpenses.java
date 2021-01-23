package com.pkg.codechef;

import java.util.Scanner;

public class TotalExpenses {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t--!=0) {
			int quantity =scan.nextInt();
			int price = scan.nextInt();
			double total = 0;
			if(quantity>1000) {
			 double mul = Double.valueOf(quantity*price);
			 total =mul-mul*10/100;
			}else {
				total = quantity*price;
			}
			System.out.format("%.6f",total);
		}
		scan.close();
	}

}
