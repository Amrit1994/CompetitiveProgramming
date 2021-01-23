package com.pkg.codechef;

//import java.io.IOException;
import java.util.Scanner;

class Players{
	
	public void leaderBoard(int[] p1, int[] p2, int n)
	{
		int j=1;
		for(int i=0; i<n; i++){
		 p1[i] -= p2[i];
		}
		
		int max =p1[0];
		
		for(int i=0; i<n; i++){
//		System.out.println("LeaderBoard is: "+p1[i]);
		if(max<p1[i])
		{
			max = p1[i];
			j++;
		}
		
		}
		System.out.println();
		System.out.println(j +" "+ max);
	}
}

public class TheLeadGame {
	public static void main(String[] args)  //throws IOException
	{
		
		Players  play = new Players();
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int p1[] =new int[n];
		int[] p2 = new int[n];
//		System.out.println("Enter first player score ");
		for(int i=0; i<n; i++)
		{
			p1[i] = sc.nextInt();
			
		}
		System.out.println();
//		System.out.println("Enter second player score ");
		for(int i =0; i<n; i++){
			p2[i] = sc.nextInt();
		}
		
		play.leaderBoard(p1, p2, n);
		

	}

}
