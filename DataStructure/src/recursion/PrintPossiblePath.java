package recursion;

public class PrintPossiblePath {

	 int totalPaths = 0;
	private void mazePath(int i, int j, int n, int m, String osf) {
		
		if(i == n-1 && j == n-1) {
			totalPaths += 1;
			System.out.println(osf);
			return;
		}
		if(i >= n || j >= n) {
			return;
		}
		
		mazePath(i, j+1, n, m, osf+"R");
		mazePath(i+1, j, n, m, osf+"D");
	}
	
	private void dicePath(int n, int i , String e) {
		
	}
	
	public static void main(String[] args) {
		PrintPossiblePath path = new PrintPossiblePath();
		path.mazePath(0, 0, 3, 3, "");
		System.out.println("Total Paths: "+ path.totalPaths);
	}
}
