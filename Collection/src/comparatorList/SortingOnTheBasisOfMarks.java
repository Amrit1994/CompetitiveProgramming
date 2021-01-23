package comparatorList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingOnTheBasisOfMarks {

	public static void main(String[] args) {
		
		
		Student st1 = new Student(101, "Amrit", 60);
		Student st2 = new Student(102, "Ajay", 100);
		Student st3 = new Student(105, "Ajinkya", 30);
		Student st4 = new Student(104, "Ashok", 80);
		Student st5 = new Student(103, "Ankit", 50);
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		
		Collections.sort(list, new Comparator<Student>(){
		
			@Override
			public int compare(Student s1, Student s2){
				double i1 = s1.getMarks();
				double i2 = s2.getMarks();
				
				if(i1<i2){
					return +1;
				}
				else if(i1>i2){
					return -1;
				}
				
				else{
					return 0;
				}
				
			}
		});
		
		for(Student st:list){
			System.out.println(st.getStudNo()+" "+ st.getStudName()+" "+st.getMarks());
		}
	}
}
