package com.pkg.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IdandShip {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = {"BattleShip","Cruiser","Destroyer","Frigate"};
		int t = Integer.parseInt(br.readLine().trim());
		while(t--!=0) {
			String inputStr = br.readLine().trim();
		for(int i =0; i<str.length; i++ ) {
			char c = str[i].charAt(0);
			if(inputStr.toUpperCase().equals(Character.toString(c))){
				System.out.println(str[i]);
				break;
			}
		}
		}
	}
}
