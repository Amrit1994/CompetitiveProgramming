package math;

import java.util.Scanner;

public class RectanglesOverlap {

	static class Point{
		int x, y;
	}
	
	static boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
		if(l1.x>=r2.x || l2.x>=r1.x) {
			return false;
		}
		if(l1.y<=r2.y || l2.y<=r1.y) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Point l1 = new Point(), r1 = new Point(),
			  l2 = new Point(), r2 = new Point();
		
		/*
		 * l1.x =0; l1.y = 10; r1.x = 10; r1.y=0; l2.x =5; l2.y = 5; r2.x = 15; r2.y=0;
		 */
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-- != 0) {
			l1.x = scan.nextInt();
			l1.y = scan.nextInt();
			r1.x = scan.nextInt();
			r1.y = scan.nextInt();

			l2.x = scan.nextInt();
			l2.y = scan.nextInt();
			r2.x = scan.nextInt();
			r2.y = scan.nextInt();
			if (doOverlap(l1, r1, l2, r2)) {
				System.out.println("Rectangles Overlap");
			} else {
				System.out.println("Rectangles Don't Overlap");
			}
		}
		
		
		
	}
}
