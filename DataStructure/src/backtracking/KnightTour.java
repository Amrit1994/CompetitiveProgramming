package backtracking;

import java.util.Scanner;

public class KnightTour {

	void display(int[][] grid, int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	boolean isItSafe(int[][] grid, int i, int j, int n, boolean[][] visited) {
		return i>=0 && j>=0 && i<n && j<n && visited[i][j] == false;
	}
	int ans;
	void knightTour(int[][] grid, int i, int j, int n, int count, boolean[][] visited) {
		if(count == n*n-1) {
			ans++;
			grid[i][j] = count;
			display(grid, n);
			return;
		}
		
		if(count == n*n) return;
		
		int[] xDir = {-2,-2,-1,-1,2,2,1,1};
		int[] yDir = {1,-1,2,-2,-1,1,2,-2};
		visited[i][j] = true;
		grid[i][j] = count;
		for(int k=0; k<8; k++) {
			if(isItSafe(grid, i+xDir[k], j+yDir[k], n, visited)) {
				knightTour(grid, i+xDir[k], j+yDir[k], n, count+1, visited);
			}
		}
		grid[i][j] = -1;
		visited[i][j] = false;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int grid[][] = new int[n][n];
		boolean[][] visited = new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = -1;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				visited[i][j] = false;
			}
		}
		
		
		
		KnightTour tour = new KnightTour();
		tour.knightTour(grid, 0, 0, n, 0, visited);
		System.out.println(tour.ans);
		scan.close();
	}
	
}
