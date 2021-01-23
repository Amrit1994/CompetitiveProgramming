package com.pkg.codechef;

import java.util.Scanner;

public class HEADBOB {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-- != 0) {
			int n = scan.nextInt();

			char ch[] = new char[n];
			for (int i = 0; i < n; i++) {
				ch[i] = scan.next().charAt(0);
			}
			int no = 0;
			for (int i = 0; i < n; i++) {
				if (ch[i] == 'I' || ch[i] == 'i') {
					System.out.println("INDIAN");
					break;
				}
				if (ch[i] == 'Y' || ch[i] == 'y') {
					System.out.println("NOT INDIAN");
					break;
				}
				if (ch[i] != 'I' && ch[i] != 'Y') {
					no++;
				}
			}
			if (no == ch.length) {
				System.out.println("NOT SURE");
			}
		}
		scan.close();
	}
}
