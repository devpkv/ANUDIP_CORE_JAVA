package com.employee; 

public class EmployeeTest {

	public static void main(String[] args) {
		 
		Employee e = new Employee(); 
		
		Employee e2 = new Employee(); 
		
		e.setEmployeeDetails(100, "Pankaj", 1000);
		
		e.hikeSalary();
		
		e.getEmployeeDetails();
		
		e2.setEmployeeDetails(100, "Rohan", 1000);
		
		e2.hikeSalary(10);
		
		e2.getEmployeeDetails();

	}

}
