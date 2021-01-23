package com.org.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class PermutationOfString {
	public static void main(String[] args) {
//		String str = "ABC";
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-- != 0) {
			String str = scan.next();
			int n = str.length();
			ArrayList<String> list= new ArrayList<String>();
			list = permutate(str, 0, n - 1, list);
			Collections.sort(list);
			for(String result: list) {
				System.out.println(result);
				System.out.println(" ");
			}
			System.out.println();
		}
	}

	private static ArrayList<String> permutate(String str, int l, int r, ArrayList<String> list) {
		if(l == r) {
			list.add(str);
		}else {
			for(int i=l; i<=r; i++) {
				str = swap(str, l, i);
				permutate(str, l+1, r, list);
				str = swap(str, l, i);
			}
		}
		return list;
	}
	
	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
		
		
	}
}
