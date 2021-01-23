package com.pkg.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine().trim());
		for(int i=0; i<n; i++){
			int fp = Integer.parseInt(br.readLine().trim());
			int fact=1;
			for(int j=1; j<=fp; j++){
				fact = fact*j;
			}
			System.out.println(fact);
		}

	}

}
