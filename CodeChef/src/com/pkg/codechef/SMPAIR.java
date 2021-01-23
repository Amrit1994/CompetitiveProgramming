package com.pkg.codechef;

import java.util.Arrays;
import java.util.Scanner;

public class SMPAIR {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t--!=0) {
			int n = scan.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<arr.length; i++) {
				arr[i] = scan.nextInt();
			}
			int small1 = arr[0];
			int small2 = arr[0];
			
			Arrays.sort(arr);
			/*
			 * for(int i=0; i<arr.length; i++) { if(small1<arr[i]) { small2 = small1; small1
			 * = arr[i]; } else if(arr[i]<small2) { small1 =arr[i]; small2=arr[i];
			 * 
			 * } }
			 */
			
			int sum = arr[0]+arr[1];
//			System.out.println("small1 == "+ small1);
//			System.out.println("small2 == "+ small2);
			System.out.println(sum);
			
		}
	}

}
