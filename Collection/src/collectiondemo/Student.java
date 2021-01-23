package collectiondemo;

 class Student {
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
	
	
}
