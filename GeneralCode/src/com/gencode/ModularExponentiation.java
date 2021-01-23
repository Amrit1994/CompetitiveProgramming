package com.gencode;

public class ModularExponentiation {

//	recursive
	static int power(int a, int N) {
		
		if(N == 0) {
			return 1;
		}else {
//			divide and conquor
			int R = power(a, N/2);
			if(N%2 == 0) {
				return R*R;
			}else {
				return R*a*R;
			}
		}
	}
	
//	iterative  binary exponentiation
	static long binPow(long a, long b) {
		
		long res = 1;
		while(b>0) {
			// if b is odd
			if((b & 1)==1) res = res*a;
			
			// b is even
			a *=a;
			b >>=1; // b/2
		}
		
		return res;
	}
	
	// find modular exponentiation using iterative way
	static int binaryExponentiation(int a, int N, int m) {
		int res = 1;
		a %= m;
		while(N>0) {
			if((N &1) == 1) res = res*a%m;
			
			a *= a%m;
			N >>=1;
			
		}
		return res;
	}
	
	static int modularExponentiation(int a, int N, int m) {
		if(N == 0) {
			return 1;
		}else {
			int R = power(a, N/2);
			if(N%2 == 0) {
				return (R*R)%m;
			}else {
				return (R*a*R)%m;
			}
		}
	}
	
	public static void main(String[] args) {
//		System.out.println(power(5, 1));
//		System.out.println(modularExponentiation(5, 2, 7));
//		long pow = (long)Math.pow(3, 11);
//		System.out.println("Math pow "+ pow);
//		System.out.println("Power using Binary Exponention "+ binPow(3, 11));
		System.out.println("Modular exponentiation using BE "+ binaryExponentiation(2, 2147483647, 13));
	}
}
