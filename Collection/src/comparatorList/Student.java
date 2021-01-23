package comparatorList;

public class Student {

	private int studNo;
	private String studName;
	private double marks;
	
	public Student(int studNo, String studName, double marks){
		
		this.studNo=studNo;
		this.studName= studName;
		this.marks= marks;
	}
	
	public int getStudNo() {
		return studNo;
	}
	
	public String getStudName() {
		return studName;
	}
	
	public double getMarks() {
		return marks;
	}
	
	
}
