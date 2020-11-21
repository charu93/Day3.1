package org.emp;

public class Employee {
	public void empId(String name) {
		System.out.println("Employee name is  " +name);
	}
	public void empId(Long phone) {
		System.out.println("Employee phone number is  "+phone);
	}
	public void empId(Float sal) {
		System.out.println("Employee Salary is  "+sal);
	}
	public void empId(int id) {
		System.out.println("Employee id is  "+id);
	}
public static void main(String[] args) {
	Employee e =new Employee();
	e.empId("Charu");
	e.empId("7708583705");
	e.empId(2000.99f);
	e.empId(20);
	
	
	
}
	
	
	
	
	
	
	
}
