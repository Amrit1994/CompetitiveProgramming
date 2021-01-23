package com.pkg.codechef;

import java.util.Scanner;

public class COMM3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int count ;
 		while(t--!=0) {
			int r= scan.nextInt();
			count = 0;
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int x3 = scan.nextInt();
			int y3 = scan.nextInt();
			
			if((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)<=r*r) {
				count++;
			}
			if((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3)<=r*r) {
				count++;
			}
			if((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1)<=r*r) {
				count++;
			}
			
			if(count>1) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
		}
 		scan.close();
	}

}
