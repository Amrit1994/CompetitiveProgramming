package backtracking;

import java.util.Scanner;

public class NKnight {

	boolean isItSafe(int r, int c, boolean[][] grid, int n) {
		if(r-2 >=0 && c-1 >=0 && grid[r-2][c-1]) return false;
		
		if(r-1 >=0 && c-2 >=0 && grid[r-1][c-2]) return false;
		
		if(r-2 >=0 && c+1<n && grid[r-2][c+1]) return false;
		
		if(r-1 >=0 && c+2<n && grid[r-1][c+2]) return false;
		return true;
	}
	
	void display(boolean[][] grid, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j]) {
					System.out.print("K ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	int ans;
	void nKnight(int n, boolean[][] grid, int cr, int cc, int count) {
		if(count == n) {
			ans++;
			display(grid, n);
			return;
		}
		
		for(int i=cr; i<n; i++) {
			for(int j=(i==cr)?cc:0; j<n; j++) {
				if(isItSafe(i, j, grid, n)) {
					grid[i][j] = true;
					nKnight(n, grid, i, j+1, count+1);
					grid[i][j] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean[][] grid = new boolean[n][n];
		NKnight knight = new NKnight();
		knight.nKnight(n, grid, 0, 0, 0);
		System.out.println(knight.ans);
	}
	
}
