package backtracking;

import java.util.BitSet;
import java.util.Scanner;

public class NQueenBacktrack {

	int countQueen = 0;
	void countNQueen(int grid[][], int curr_row, int n) {
		
		if(curr_row == n) {
			countQueen++;
			display(grid, n);
			System.out.println();
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(isItSafe(grid, curr_row, i, n)) {
				grid[curr_row][i] = 1;
				countNQueen(grid, curr_row+1, n);
				grid[curr_row][i] = 0;
			}
		}
	}
	
	void display(int grid[][], int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(grid[i][j] == 1) {
					System.out.print(" Q ");
				}else {
					System.out.print(" . ");
				}
			}
			System.out.println();
		}
		
	}
	
	boolean isItSafe(int grid[][], int row, int column, int n) {
		
		//upper column check
		for(int i=row-1; i>=0; i--) {
			if(grid[i][column] == 1) 
				return false;
		}
		
		// left upper diagonal check
		for (int i = row - 1, j = column-1; i >= 0 && j >=0; i--, j--) {
			if (grid[i][j] == 1)
				return false;
		}
		
		// right upper diagonal check
		for (int i = row - 1, j = column + 1; i >= 0 && j<n; i--, j++) {
			if (grid[i][j] == 1)
				return false;
		}
		
		return true;
	}
	
	int noOfQueen;
	BitSet col, ld, rd = new BitSet();
	public void countNqueenBitMasking(int grid[][], int cur_row, int n) {
		
		if(cur_row == n) {
			noOfQueen++;
			display(grid, n);
			return;
		}
		
		for(int c=0; c<n; c++) {
			if(!col.get(c) && !ld.get(cur_row-c+n-1) && !rd.get(cur_row+c)) {
				col.set(c);
				ld.set(cur_row-1); 
				rd.set(cur_row+c);
				countNqueenBitMasking(grid, cur_row+1, n);
				
				col.set(c);
				ld.set(cur_row-1); 
				rd.set(cur_row+c);
				
				
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int grid[][] = new int[n][n];
		for(int i =0 ; i < n ; i++)
        {
            for(int j =0 ; j < n ; j++)
            {
                grid[i][j]=scan.nextInt();
            }
        }
		NQueenBacktrack backtrack = new NQueenBacktrack();
		backtrack.countNQueen(grid, 0, n);
		System.out.println(backtrack.countQueen);
		scan.close();
	}
}
