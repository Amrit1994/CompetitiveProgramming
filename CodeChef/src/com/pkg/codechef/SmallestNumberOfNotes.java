package com.pkg.codechef;

import java.util.Scanner;

public class SmallestNumberOfNotes {
	
	public static void main(String args[]) {
		
		int [] notes = {100, 50, 10, 5, 2, 1};
		
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		while(testcase != 0) {
			int num = sc.nextInt();
			int rs =0;
			for(int i =0; i<notes.length; i++) {
				rs += num/notes[i];
				num = num%notes[i];
			}
			System.out.println(rs);
		}
		sc.close();
	}

}
