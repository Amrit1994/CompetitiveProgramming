package com.pkg.codechef;
import java.util.*;
import java.math.BigInteger;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class SmallFact {
//	   public static void main(String[] args)
//	    {
//	        Scanner sc=new Scanner(System.in);
//	        int t,n,i,j;
//	        BigInteger f;
//	        t=sc.nextInt();
//	        for(i=0;i<t;i++)
//	        {
//	            f=new BigInteger("1");
//	            n=sc.nextInt();
//	            for(j=1;j<=n;j++)
//	            {
//	                f=f.multiply(BigInteger.valueOf(j));
//	            }
//	            System.out.println(f);
//	        }
//	    }
	
	
	 
	/* Name of the class has to be "Main" only if the class is public. */
	
	
		public static void main (String[] args) throws java.lang.Exception
		{
			java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
	        long s = Long.parseLong(r.readLine());
	        long i = 0;
	        
	        while (i < s) {
	            long initialVal = 1;
	            long n = Integer.parseInt(r.readLine());
	            BigInteger factoriel = BigInteger.valueOf(1);
	            
	            while (initialVal <= n) {
	                factoriel = factoriel.multiply(BigInteger.valueOf(initialVal));
	                initialVal++;
	            }
	            
	            System.out.println(factoriel);
	            i++;
	        }
	        
		}
	}
	
