package backtracking;

import java.util.Scanner;

public class RatInMaze {
	static int result =0;
    static boolean isSafe(int i , int j , int n )
    {
        return i>=0 && i<n && j>=0 && j < n ;

    }

	static void rateInMaze(int arr[][], int n, int i, int j, int[][] visited) {
		if (arr[n - 1][n - 1] == 1)
			return;
		if (i == n - 1 && j == n - 1) {
			result++;
			return;
			// one possible way to get out of the ratInMaze
		}
		if (!isSafe(i, j, n)) {
			// out of boundry
			return;
		}
		visited[i][j] = 1;
		if (isSafe(i - 1, j, n) && arr[i - 1][j] == 0 && visited[i - 1][j] == 0) {
			// up
			rateInMaze(arr, n, i - 1, j, visited);
		}

		if (isSafe(i + 1, j, n) && arr[i + 1][j] == 0 && visited[i + 1][j] == 0) {
			// down
			rateInMaze(arr, n, i + 1, j, visited);
		}

		if (isSafe(i, j - 1, n) && arr[i][j - 1] == 0 && visited[i][j - 1] == 0) {
			// left
			rateInMaze(arr, n, i, j - 1, visited);
		}

		if (isSafe(i, j + 1, n) && arr[i][j + 1] == 0 && visited[i][j + 1] == 0) {
			// right
			rateInMaze(arr, n, i, j + 1, visited);
		}
		visited[i][j] = 0;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int visited[][] = new int[n][n];
        for(int i =0 ; i < n ; i++)
        {
            for(int j =0 ; j < n ; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        rateInMaze(arr,n,0,0,visited);
        System.out.println(result);
    }
}
