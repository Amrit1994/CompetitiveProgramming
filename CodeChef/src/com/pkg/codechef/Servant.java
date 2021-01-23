package com.pkg.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Servant {

	public static void main(String[] args) throws IOException {

//		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter how many element you want to enter");
		int n = Integer.parseInt(br.readLine());
		int k = 0;
		while(n--!=0){
			k = Integer.parseInt(br.readLine());

			/*if (k < 10) {
				System.out.println("What an obedient servant you are!");
			} else {
				System.out.println(-1);
			}*/
			String sol = k<10?"What an obedient servant you are!":"-1";
			System.out.println(sol);
		}
		

	}

}
