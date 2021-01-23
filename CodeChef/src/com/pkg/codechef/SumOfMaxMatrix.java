package com.pkg.codechef;

import java.util.Scanner;

public class SumOfMaxMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int size = 5;
		int [][] nums = new int[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<=i; j++) {
				nums[i][j] = sc.nextInt();
			}
		}
		for(int i=1; i<size; i++) {
			nums[i][0] = nums[i-1][0];
		}
		int max = nums[size-1][0];
		
		for(int i=1; i<size; i++) {
			for(int j=1; j<=i; j++) {
				nums[i][j] += Math.max(nums[i-1][j], nums[i-1][j-1]);
				if(i == size-1) {
					if(max<nums[i][j]) {
						max = nums[i][j];
					}
				}
			}
			System.out.println(max);
		}
//		System.out.println(max);
	}
}
