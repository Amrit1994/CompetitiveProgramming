package CmparatorMap;

public class Employee {
	private int id;
	private String name;
	private double sal;
	public Employee(int id, String name, double sal){
		this.id = id;
		this.name = name;
		this.sal = sal;
		
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSal() {
		return sal;
	}
	
	/*public void printData(){
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee salary: "+sal);
	}*/
	
	

}
