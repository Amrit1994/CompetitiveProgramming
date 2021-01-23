package comparabledemo;

 class Student implements Comparable<Student> {
	int rollno;
	int age;
	String name;
 
	Student(int age, int rollno, String name){
		
		this.age = age;
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student {rollno=" + rollno + ", age=" + age + ", name=" + name + "}";
	}
	
	public int compareTo(Student s)
	{
		return this.age<s.age?1:-1;
	}
	
	
}
