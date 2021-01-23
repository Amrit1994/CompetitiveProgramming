package com.gencode;

import java.util.Scanner;

public class GCDWithoutRecursion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        while(t--!=0){
            
            int a = scan.nextInt();
            int b = scan.nextInt();
            int x = a;
            int y = b;
            while(x!=y){
                if(x>y){
                    x = x-y;
                }else{
                    y = y-x;
                }
            }
//            System.out.println("gcd of== "+ x);
            
            int lcm = a*b/x;
            System.out.println(lcm +" "+ x);
        }
        scan.close();
		
	}
}
