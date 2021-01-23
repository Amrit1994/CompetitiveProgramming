package recursion;

public class PrintPattern {

	
	private static void pattern1(int n) {
		if(n == 0) return;
		
		for(int i =0; i<n; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		pattern1(n-1);
	}
	
	//remove for loop
	private static void pattern2(int n, int i) {
		if (n == 0)
			return;
		if (i < n) {
			System.out.print("*");
			pattern2(n, i + 1);
		} else {
			System.out.println();
			pattern2(n - 1, 0);
		}

	}

	private static void pattern3(int n, int i) {
		if (n == 0)
			return;
		if (i < n) {
			pattern3(n, i + 1);
			System.out.print("*");
		} else {
			pattern3(n - 1, 0);
			System.out.println();
		}

	}
	
	
	public static void main(String[] args) {
		pattern3(5, 0);
	}
}
