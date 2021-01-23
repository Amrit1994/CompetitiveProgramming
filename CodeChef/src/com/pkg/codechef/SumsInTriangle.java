package com.pkg.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumsInTriangle {
	public static void main(String[] args)throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int T = Integer.parseInt(br.readLine());
		String line = br.readLine();
		String[] str = line.trim().split(" ");
		int n = Integer.parseInt(line.trim());
		
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++)
		{
			arr[i][i] = Integer.parseInt(str[i]);
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i][i]);
		}
		
		
		
	}
	

}
