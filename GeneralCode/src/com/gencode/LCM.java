package com.gencode;

public class LCM {

	public static int gcd(int a, int b) {
		
		if(b== 0) {
			return a;
		}
		return gcd(b, a%b);
	}
	
	public static  int lcm(int a, int b) {
		
		int lcm = a*b/gcd(a,b);
		return lcm;
	}
	
	
	public static void main(String[] args) {
		int a =25, b= 15;
		System.out.println("LCM== "+ a + " and "+ b+ " is: "+lcm(a, b));
	}
}
