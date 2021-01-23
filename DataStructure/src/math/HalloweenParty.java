package math;

public class HalloweenParty {
	
	public static int getParty(int n) {
		if(n%2 == 0) {
			int rem = n/2;
			return (rem*rem);
		}else {
			int r = n/2;
			int prod = r+1;
			return (r*prod);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getParty(7));
	}

}
