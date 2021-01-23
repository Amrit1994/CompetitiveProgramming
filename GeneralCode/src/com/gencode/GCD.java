package com.gencode;

//Euclidean Algorithm
public class GCD {

	public static int gcd(int a, int b) {
		
		System.out.println(a +" "+ b);
		if(a==0) {
			System.out.println("b=="+ b);
			return b;
		}
		System.out.println("b%a== "+ b%a +" a=="+ a);
		return gcd(b%a, a);
	}
	
	public static void main(String[] args){
		
		int a =25, b= 15;
		System.out.println("GCD== "+ a + " and "+ b+ " is: "+gcd(6, 9));
	}
}
