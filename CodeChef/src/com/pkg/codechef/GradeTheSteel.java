package com.pkg.codechef;

import java.util.Scanner;

public class GradeTheSteel {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t =scan.nextInt();
		while(t-->0) {
			int hardness = scan.nextInt();
			double CC = scan.nextDouble();
			long ts = scan.nextLong();
			
			if(hardness > 50 && CC<0.7 && ts>5600) {
				System.out.println(10);
			}else if(hardness > 50 && CC<0.7){
				System.out.println(9);
			}
			else if(CC<0.7 && ts>5600) {
				System.out.println(8);
			}
			else if(hardness > 50 && ts>5600) {
				System.out.println(7);
			}
			else if(hardness > 50 || CC<0.7 || ts>5600 ) {
				System.out.println(6);
			}
			else {
				System.out.println(5);
			}
		}
	}

}
