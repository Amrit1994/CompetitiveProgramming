package backtracking;

public class NQueen {
	final int N =4; 
	
	
	
	public void printSolution(int board[][]) {
		for(int i=0; i<N; i++) {
			for(int j =0; j<N; j++) {
				if(board[i][j] == 1)
				System.out.print( board[i][j]);
			}
			System.out.println();
		}
	}
	
	public static boolean isSafe(int[][] board, int row, int col) {
		int i, j;
		
		/* check this row on left side*/
		
		for(i=0; i<col; i++) {
			if(board[row][i] == 1) {
				return false;
			}
		}
		
		/*check upper diagonal on left side*/
		for(i=row, j=col; i>=0 && j>=0; i--, j--) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		
		/*check lower diagonal on left side*/
		for(i=row, j=col; i>=0 && j>=0; i++, j--) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean solveNQUtil(int board[][], int col) {
		if(col>=N) {
			return true;
		}
		for(int i=0; i<N; i++) {
			if(isSafe(board, i, col)) {
				board[i][col] = 1;
			}
			if(solveNQUtil(board, col+1) == true) {
				return true;
			}
				board[i][col] = 0; 	
			
		}
		return false;
	}
	
	public boolean solveNQ() {
		int board[][] = {{0, 0, 0, 0},
						 {0, 0, 0, 0},
						 {0, 0, 0, 0},
						 {0, 0, 0, 0}};
		
		if(solveNQUtil(board, 0) == false) {
			System.out.print("Solution does not exist ");
			return false;
		}
		printSolution(board);
		return true;
		
	}
	
	public static void main(String[] args) {
		NQueen nQueen = new NQueen();
		nQueen.solveNQ();
	}
	
}
