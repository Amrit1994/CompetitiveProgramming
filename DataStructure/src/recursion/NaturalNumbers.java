package recursion;

public class NaturalNumbers {
	
	public static void printNaturalNumberAsc(int n) {
		
		if(n == 0) {
			return ;
		}
		
		 printNaturalNumberAsc(n-1);
		 System.out.println(n);
	
	}
public static void printNaturalNumberDesc(int n) {
		
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printNaturalNumberDesc(n-1);
	}
	
public static void printNaturalNumberDecInc(int n) {
	
	if(n == 1) {
		System.out.println(1);
		return;
	}
	System.out.println(n);
	printNaturalNumberDecInc(n-1);
	System.out.println(n);
}
	public static void main(String[] args) {
//		 printNaturalNumberAsc(5);
//		 printNaturalNumberDesc(5);
		 printNaturalNumberDecInc(5);
	}

}
