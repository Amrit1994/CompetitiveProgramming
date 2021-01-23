package com.org.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViceVersaString {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String str = "Hello World";
		String [] word = br.readLine().split(" ");
		
		String s1= word[0];
		String s2 = word[1];
		
		System.out.println(s2+ " " + s1);
	}
}
