package com.pkg.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnormusInputTest {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		int t =0;
		int count =0;
		for(int i=0; i< n; i++)
		{
			 t = Integer.parseInt(br.readLine());
			 if(t%k==0)
				{
					count++;
				}
			
		}
//		for(int i=0; i<n; i++)
//		{
//			if(t%k==0)
//			{
//				count++;
//			}
//		}
		
		System.out.println("Output: ");
		System.out.println(count);
	}

}
