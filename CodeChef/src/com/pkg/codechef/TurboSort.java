package com.pkg.codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TurboSort {
	public static void main(String[] args)
	{
//		System.out.println("");
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		Set<Integer> values = new TreeSet<>();
//		List<Integer> values = new ArrayList<>();
				
					for(int i=0; i<n; i++){
						int k = scan.nextInt();
						values.add(k);
	
					}
					
//					Collections.sort(values);
					
					for(int i: values){
						System.out.println(i);
	}
	}
	

}
