package com.pkg.codechef;

import java.util.Scanner;

public class BlockGame {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			int n = 0;
			n = sc.nextInt();

			while (n-- != 0) {
				int num = sc.nextInt();
				int rev = 0;
				int temp = 0;
				temp = num;
				while (num != 0) {
					rev = rev * 10 + num % 10;
					num = num / 10;
				}
				if (rev != temp) {
					System.out.println("looses");
				} else {
					System.out.println("wins");
				}

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
