package com.pkg.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mahasena {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int n =0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if(br.readLine() !=null) {
		 n = Integer.parseInt(br.readLine());
		}
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			if (br.readLine() != null) {
				arr[i] = Integer.parseInt(br.readLine());
			}
		}

		int eventCount = 0;
		int oldCount = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				eventCount++;
			} else {
				oldCount++;
			}
		}
		if (eventCount > oldCount) {
			System.out.println("READY FOR BATTLE");
		} else {
			System.out.println("NOT READY");
		}
	}

}
