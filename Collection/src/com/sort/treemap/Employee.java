package com.sort.treemap;


public class Employee implements Comparable<Employee> {
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

	@Override
	public int compareTo(Employee e1) {
		if(this.sal<e1.getSal()){
			return 1;
		}
		else if(this.id>e1.getSal()){
			return -1;
		}
		else if(this.id==e1.getSal()){
			return 0;
		}
		else{
		    return 0;
		}
	}
}