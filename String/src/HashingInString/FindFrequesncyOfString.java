package HashingInString;

import java.util.Scanner;

public class FindFrequesncyOfString {

	public static void main(String[] args) {

		int arr[] = new int[26];
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 'a']++;
		}

//		find unique string
		/*
		 * for(int i=0; i<str.length(); i++) { if(str.charAt(i)-'a'==1) {
		 * System.out.println(str.charAt(arr[i])); } }
		 * 
		 */ 
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i)-'a');
		}
	}
}
