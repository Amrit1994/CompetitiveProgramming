package recursion;

public class MathRecursion {

	public static int fact(int n) {
		
		if(n== 1) {
			return 1;
		}
		int subprob = fact(n-1);
		return n*subprob;
	}
	
	public static int fib(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		
		int subprob1 = fib(n-1);		
		int subprob2 = fib(n-2);
		
		return subprob1 + subprob2;
	}
	
	public static int lengthOfBinaryString(int n) {
		if(n == 1 || n == 2) {
			return n+1;
		}
		
		return lengthOfBinaryString(n-1) + lengthOfBinaryString(n-2);
	}
	
//	how many ways n friend goes to party
	public static int noOfWays(int n) {
		if(n==1 || n==2) {
			return n;
		}
		
		return noOfWays(n-1) + (n-1) * noOfWays(n-2);
	}
	
	public static int calPower(int a, int b) {
		
		if(b==0) {
			return 1;
		}
		
		return a*calPower(a, b-1);
		
	}
	
	public static int optimizedPower(int a, int b) {
		if(b == 0) return 1;
		if(b == 1) return a;
		
		int temp = optimizedPower(a, b/2);
		
		if(a%2 == 0) {
			return temp*temp;
		}else {
			return a*temp*temp;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("factorial: "+ fact(5));
		System.out.println("fibonacci: "+ fib(3)); // 0 1 1 2 3 5
		System.out.println("noOfWays: "+ noOfWays(3)); 
		System.out.println("lengthOfBinaryString without consecutive ones: "+ lengthOfBinaryString(5));
		System.out.println("power of a^b: "+ calPower(3, 2));
		System.out.println("optimized power of a^b: "+ optimizedPower(5, 3));

		
	}
}
