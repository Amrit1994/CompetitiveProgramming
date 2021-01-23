package com.org.string;

import java.util.Scanner;


/*Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr*/
public class ReverseWords {

	public static String revereseWord(String str) {
		String[] splitWord = str.split("[.]");
		int n = splitWord.length;
		String rev = "";
		for(int i=n-1; i>=0; i--) {
			rev += splitWord[i];
			if(i != 0) {
				rev +=".";
			}
		}
		return rev;
	}
	
	

	public static void main(String[] args) {
		String str = "";
		Scanner scan = new Scanner(System.in);
		int t= scan.nextInt();
		while(t-- != 0) {
			str = scan.next();
			String result = revereseWord(str);
			System.out.println(result);
		}
		
		scan.close();
	}
}
