package com.org.string;

import java.util.Scanner;

public class StringReversePosition {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		String reverse = " ";
		
		for(int i=0; i<= arr.length; i++)
		{
			for(int j= arr[i].length()-1; j>=0; j--)
			{
				reverse += arr[i].charAt(j);
			}
			System.out.print(reverse+ " ");
			reverse = " ";
		
		sc.close();
	}

}

}