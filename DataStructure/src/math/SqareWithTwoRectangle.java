package math;
/*Vasya claims that he had a paper square. He cut it into two rectangular 
parts using one vertical or horizontal cut. Then Vasya informed you the 
dimensions of these two rectangular parts. You need to check whether Vasya 
originally had a square. In other words, check if it is possible to make 
a square using two given rectangles.*/

public class SqareWithTwoRectangle {

	static boolean isSquare(int a1, int b1, int a2, int b2) {
		if(Math.max(a1, b1) == Math.max(a2,  b2) && Math.min(a1, b1)+ Math.min(a2, b2) == Math.max(a1, b1)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int a1 = 3; int b1=3; int a2=1; int b2=3;
		boolean isSquare = isSquare(a1, b1, a2, b2);
		if(isSquare) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
