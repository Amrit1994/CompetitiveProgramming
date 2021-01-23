package com.gencode;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePrime {

	public static void main(String[] args) {
		///int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19 };
		int k = 2;
		for (int i = 1; i < 50; i++) {
			boolean flag = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}

			
			if (!flag) {
//				System.out.println(k+"==");
				// if(i%2 =0) {
//				ArrayList<Integer> al = new ArrayList<Integer>();
//				al.add(i);
//				
				// for(int k=0; k<al.size(); k++) {
	
				if(k%2 == 0)
					System.out.println(i);
				k++;
				}
			
			
				// }
			}
		}
	}


