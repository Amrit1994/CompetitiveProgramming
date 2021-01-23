package com.pkg.codechef;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		for(int i=0; i<n; i++){
			int p = sc.nextInt();
			int r = sc.nextInt();
			int s = sc.nextInt();
			if((p<r && r<s)||(p>r&&r>s)){
				System.out.println(r);
			}
			else if((p<s&&s<r)||(p>s&&s>r)){
				System.out.println(s);
			}
			else{
				System.out.println(p);
			}
		}

	}

}
