package com.pkg.codechef;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t--!=0) {
			double basicSalary = scan.nextLong();
			if(basicSalary<1500) {
				double HRA = basicSalary*10/100;
				double DA = basicSalary*90/100;
				double grossSalary = basicSalary+HRA+DA;
				System.out.println(grossSalary);
			}
			else if(basicSalary>=1500) {
				double HRA = 500;
				double DA = basicSalary*98/100;
				double grossSalary = basicSalary+HRA+DA;
				System.out.println(grossSalary);
			}
		}
		scan.close();
	}
}
