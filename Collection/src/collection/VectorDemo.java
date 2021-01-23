package collection;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args){
		
		ArrayList<Integer> v = new ArrayList<>();// 50% memory use// not thread safe// fast
//		Vector<Integer> v = new Vector<>(); // 100% memory use// thread safe// slow
		v.add(2);
		v.add(3);
		v.add(6);
		v.add(4);
		v.add(7);
		v.add(8);
		v.add(9);
		v.add(5);
		v.add(3);
		v.add(6);
		//v.add(4);
		v.remove(1);
//		System.out.println(v.size());
//		System.out.println(v.capacity());
		for(int i: v){
			System.out.println(i);
		}
	}
}
