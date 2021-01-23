package math;

import java.util.Scanner;

public class Table {
	
	// recursion
	public static void table(int num, int i) {

		if (i == 10) {
			System.out.println(num + " * " + i + " = " + num * i);
			return;
		}
		System.out.println(num + " * " + i + " = " + num * i);
		table(num, i + 1);

	}

	// loop
	public static void printTable(int num) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int n = s.nextInt();
		printTable(n);
	}
}
