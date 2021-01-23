package math;

import java.util.Scanner;

public class SequenceWithDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		long a1 = 0;
		while(t--!=0) {
			a1 = scan.nextLong();
			long k = scan.nextLong();
			long b = a1, f=1;
			while(f<k) {
				long s = 9, l=0; b=a1;
				while(b!=0) {
					long r = b%10;
					l = Math.max(r, l);
					s = Math.min(r, s);
					b = b/10;
				}
				
				if(l == 0 || s == 0) {
					break;
				}else {
					a1 = a1 + (l*s);
				}
				f++;
			}
			System.out.println(a1);
			
		}
		
	}
}
