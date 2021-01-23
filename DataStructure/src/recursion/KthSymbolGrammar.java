package recursion;

public class KthSymbolGrammar {

	
	public static int solve(int N, int K) {
		if(N == 1 && K == 1) {
			return 0;
		}
		int mid = (int)Math.pow(2, N-1)/2;
		if(K <= mid) {
			return solve(N-1, K);
		}else {
			int result = solve(N-1, K-mid);
			return result == 0 ? 1 :0;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(solve(2, 2));
	}
}
