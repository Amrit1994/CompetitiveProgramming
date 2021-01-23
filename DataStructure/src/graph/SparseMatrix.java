package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter How many edges you want");
		int e = scan.nextInt();
		int mat[][] = new int[e][e];
		//ArrayList<Integer> noOfVertices[];
		// noOfVertices = new ArrayList[0];
		int veticesNo = 0;
		for (int i = 0; i < e; i++) {
			
			System.out.println("Enter edge no. " + i);
			veticesNo = scan.nextInt();
			
			/*
			 * noOfVertices[i] = new ArrayList<Integer>(); noOfVertices = new
			 * ArrayList[veticesNo]; noOfVertices[i].add(veticesNo);
			 */
			for (int j = 0; j < veticesNo; j++) {
				System.out.println("Enter From src");
				int u = scan.nextInt();
				System.out.println("Enter To Dest");
				int v = scan.nextInt();

				mat[i][j] = u;
				mat[j][i] = v;
				
			}
			
		}
		
		for(int  i =0; i<e; i++) {
			for(int j =0; j<veticesNo; i++) {
				System.out.println(mat[i][j]);
			}
		
		}
		scan.close();
	}
}
