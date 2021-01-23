package com.gencode;

public class SieveOfEratosthenes {

	void sieveOfEratosthenes(int n) {
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i < n; i++) {
			prime[i] = true;
		}
//		if (prime[0] || prime[1]) {
//			System.out.println(-1);
//		} else {
			for (int p = 2; p * p <= n; p++) {
				if (prime[p]) {
					// update all multiples p
					for (int i = p * p; i < n; i += p) {
						prime[i] = false;
					}
				}
			}
//		}

		for (int i = 2; i <= n; i++) {
			if (prime[i] && prime[n - i]) {

				System.out.print(i + " " + (n - i));
				return;
			}
		}
	}

	public static void main(String[] args) {
		int n = 11749;
		System.out.print("Following are the prime numbers ");
		System.out.println("smaller than or equal to " + n);
		SieveOfEratosthenes g = new SieveOfEratosthenes();
		g.sieveOfEratosthenes(n);
//		|| n== 6335 || n == 26501 || n == 15725 || n == 11479 || n == 29359
//		        || n == 26963 || n == 24465 || n == 5437 || n == 14605 || n == 3903 || n == 293|| n == 12383
	}
}
