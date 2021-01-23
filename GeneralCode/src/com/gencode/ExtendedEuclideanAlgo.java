package com.gencode;

public class ExtendedEuclideanAlgo {

	static int gcd(int a, int b, int x, int y) {
		if(a == 0) {
			x =0; y =1;
			return b;
		}
		int x1=1, y1 =1;
		int d = gcd(b%a, a, x1, y1);
		x = y1-(b/a)*x1;
		y = x1;
		return d;
	}
	
	static void modInverse(int a, int m) {
		int x =1, y =1;
		int gcd = gcd(a, m, x, y);
		if(gcd != 1) {
			System.out.println("Inverse doesn't exist");
		}else {
			int res = (x%m +m)%m;
			System.out.println("Modular inverse is "+res);
			
		}
	
	}
	
	public static void main(String[] args) {
	
		int x = 1, y =1;
		int a = 35, b =15;
		System.out.println("gcd is "+gcd(a, b, x, y));
//		to find modular inverse
		modInverse(3, 11);
		
	}
}
