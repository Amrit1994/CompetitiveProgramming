package comparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollectionStudent {

	public static void main(String[] args){
		
		Student s1 = new Student(25, 1, "Amit");
		Student s2 = new Student(23, 2, "Kapil");
		Student s3 = new Student(22, 3, "Navin");
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
	    Collections.sort(list);
		
		for(Student st: list){
//			System.out.println(st.age+" "+st.rollno+" "+st.name);
			System.out.println(st);
		}
	}
}
