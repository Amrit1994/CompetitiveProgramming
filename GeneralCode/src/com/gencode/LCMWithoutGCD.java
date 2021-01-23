package com.gencode;

public class LCMWithoutGCD {
	
	public static void main(String[] args) {
		
		int a = 25, b= 15;
		int lcm =0;
	
		int lar = Math.max(a, b);
		int small = Math.min(a, b);
		for(int i =lar; ; i += lar) {
			
			if(i%small == 0) {
				lcm = i;
				System.out.println("LCM of "+ a+ " and "+ b+ " is: "+ lcm);
				break;
			}
		}
		
		
	}

}
