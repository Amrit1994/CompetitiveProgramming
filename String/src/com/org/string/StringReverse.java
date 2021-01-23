package com.org.string;

import java.io.BufferedReader;
import java.util.Scanner;

public class StringReverse {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		//BufferedReader brd = new BufferedReader(sc.nextLine());
		String s = sc.nextLine();
		String [] str = s.split(" ");
		String reverse = " ";
		
		for(int i  = 0; i < str.length; i++){
			
		
		for(int j = str[i].length()-1; j>=0; j--)
		{
//			reverse += str[i].charAt(j);
			System.out.print(str[i].charAt(j));
			
		}
//		System.out.print(reverse+ " ");
//		reverse = " ";
		System.out.print(" ");
		
		
		sc.close();  
		
		
		/**Scanner sc  = new Scanner(System.in);
		String s  = sc.nextLine();
		String [] str = s.split(" ");
		String reverse = " ";
		//System.out.println(str.reverse());
		for(int i = str.length-1; i>=0; i--)
			reverse = reverse + str[i].charAt(i);
		System.out.println(reverse);
		sc.close();**/
	}

	

}
}