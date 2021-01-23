package datastructure;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

 class SortingDemo {
	
	//System.out.println(" Enter the numbers");
	//Scanner scan = new Scanner(System.in);
	 static  void Sorted(int[] number){
	Set<Integer> numbers  = new TreeSet<>();
	for(int i =0; i<number.length; i++){
	numbers.add(number[i]);
	}
	
	Iterator itr =  numbers.iterator();
	//numbers = scan.nextInt();
	System.out.print("Arrays after sorting: ");
	while(itr.hasNext()){
		 
		System.out.print(itr.next()+" ");
}
	}
	

	public static void main(String[] args){

		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int[] number =new int[5];
		for(int i=0; i<number.length; i++){
		number[i] = scan.nextInt();
		}
		System.out.print("Arrays Before sorting: ");
		for(int i=0; i<number.length; i++){
			System.out.print(number[i]+ " ");
		}
		System.out.println();
		Sorted(number);
	}


}

