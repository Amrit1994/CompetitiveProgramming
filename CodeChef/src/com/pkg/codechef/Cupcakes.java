package com.pkg.codechef;

import java.io.IOException;
import java.util.Scanner;

public class Cupcakes {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int r;
		int n = scan.nextInt();
		int []arr = new int[n];
		for(int i=0; i<n; i++){
			
			arr[i] = scan.nextInt();
			r = arr[i]/2 +1;
			System.out.println(r);
		}
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int T = Integer.parseInt(br.readLine());
//		int[] arr = new int[T];
//		String line = br.readLine();
//		String[] strs = line.trim().split("\\s+");
//		for(int i=0; i<T; i++)
//		{
//			 arr[i] = Integer.parseInt(strs[i]);
////			int size = N.size();
//			r = arr[i]/2 +1;
//			System.out.println(r);
//		}

	}
}


