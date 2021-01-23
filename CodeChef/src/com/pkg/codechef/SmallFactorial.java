package com.pkg.codechef;

import java.io.IOException;
import java.util.Scanner;

class SolveFact{
	
	public int fact(int n)
	{
		
		if(n==1)
		{
			return 1;
		}
		else{
			n=n*fact(n-1);	
			
		}
		return n;
		
		
	}
}

public class SmallFactorial {
	
	 	public static void main(String[] args) throws IOException
	 	{
	 
	 	SolveFact obj = new SolveFact();
	 	
	
	
	 	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	 	
	 	int n = scan.nextInt();
	 	int[] k = new int[n];
	 	for(int i=0; i<=n; i++){
	 	k[i] = scan.nextInt();
	 	System.out.println(obj.fact(k[i]));
	 	}
	}
}

