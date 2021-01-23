package com.gencode;

public class UniquePrimeFactors {

	
	static int primeFactor(long n) {
		int primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};
		int count = 0;
		long pf = primes[0];
		System.out.println("primes ="+primes[0]);
		for(int j=1; j<primes.length && pf<=n && n !=1; j++) {
			System.out.println("primes ="+primes[j]);
			pf = pf*primes[j];
//			System.out.println("pf="+pf);
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(primeFactor(500));
	}
}
