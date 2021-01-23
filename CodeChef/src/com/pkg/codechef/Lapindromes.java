package com.pkg.codechef;

import java.util.Scanner;

public class Lapindromes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		while (t-- != 0) {
			String s = scan.next();
			int size = s.length();
			if (size % 2 == 0) {
				String subStr1 = s.substring(0, size / 2);
				StringBuffer subStr2 = new StringBuffer(s.substring(size / 2, size));
				if (subStr1.equals(subStr2.toString())) {
					System.out.println("Yes");
				}else if(subStr1.equals(subStr2.reverse().toString())) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			} else {
				String subStr1 = s.substring(0, size / 2);
				StringBuffer subStr2 = new StringBuffer(s.substring(size / 2 + 1, size));
				if (subStr1.equals(subStr2.toString())) {
					System.out.println("Yes");
				} 
				else if(subStr1.equals(subStr2.reverse().toString())) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}

		scan.close();
		// char[] arr= str.toCharArray();

	}
}
