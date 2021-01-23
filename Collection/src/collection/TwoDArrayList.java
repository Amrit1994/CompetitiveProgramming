package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArrayList {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num_of_rows = scan.nextInt();
		int num_of_columns = scan.nextInt();
		
		ArrayList<ArrayList<Integer>> outerList = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> innerList = new ArrayList<>();
		for(int i=0; i<num_of_rows;i++){
			outerList.add(innerList);
			
			for(int j=0; j<num_of_columns; j++){
				outerList.get(i).add(scan.nextInt());
			}
		}
		
		for(int i=0; i<outerList.size(); i++){
			for(int j=0; j<outerList.get(i).size(); j++){
				System.out.print(outerList.get(i).get(j)+" ");
			}
			System.out.println();
		}
		scan.close();
	}

}
