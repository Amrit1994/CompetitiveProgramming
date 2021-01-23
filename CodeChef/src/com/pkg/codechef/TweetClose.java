package com.pkg.codechef;

import java.util.Scanner;

public class TweetClose {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//int tweet = scan.nextInt();
		//int click = scan.nextInt();
		int count =0;
		int N = scan.nextInt();
		int K = scan.nextInt();
		int arr[] = new int[N+1];
		while(K-->0) {
			String tweet = scan.nextLine();
			if(tweet.equals("CLICK")) {
				int i = scan.nextInt();
				if(arr[i-1] == 0) {
					arr[i-1] = 1;
					count++;
				}else if(arr[i-1] == 1) {
					arr[i-1] = 0;
					count--;
				}else if(tweet.equals("CLOSEALL")) {
					for(int j=0; j<N; j++) {
						arr[j] = 0; 
						count =0;
					}
				}
				System.out.println(count);
						
			}
			
		
		}
		
	}

}
