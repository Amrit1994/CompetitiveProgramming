package com.pkg.codechef;

import java.util.Arrays;
import java.util.Scanner;

public class AmbiguosPermutation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		int[] num = new int[testcase];
		int invp[] = new int[testcase];
		
		for(int i=0; i<testcase; i++) {
			 num[i] = scan.nextInt();
			 System.out.println("i+1 "+ i+1 );
			 invp[num[i]-1] = i+1;
			 System.out.println(invp[num[i]-1]);
			 
		}
		
		//for(int i=0; i<testcase; i++) {
			if(Arrays.equals(num, invp)) {
				System.out.println("Ambiguous");
			}else {
				System.out.println("not ambiguous"); 
			}
	//	}
		
			scan.close();
	}
}
