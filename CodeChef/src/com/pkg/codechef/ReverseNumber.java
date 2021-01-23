package com.pkg.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {

	
	public static void main(String[] args) throws NumberFormatException, IOException{
		int rev=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<n; i++){
			int str = Integer.parseInt(br.readLine());
			
			while(str!=0){
			 rev = rev*10+str%10;
			  str = str/10;
			}
			
			System.out.println(rev);
			rev=0;
			
		}
		
	}
}
