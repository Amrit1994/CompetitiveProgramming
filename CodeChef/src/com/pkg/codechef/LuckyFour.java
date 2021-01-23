package com.pkg.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyFour {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++){
			String four = br.readLine().trim();
			int count =0;
			for(int j=0; j<four.length(); j++){
				if(four.charAt(j)=='4'){
					count++;
				}
			}
			System.out.println(count);
		}
		

	}

}
