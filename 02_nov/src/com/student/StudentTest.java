package com.student;

public class StudentTest {

	public static void main(String[] args) {

		// loose coupling
		Student s1 = new Student();
		
		s1.setId(100);
		System.out.println(s1.getId());
		
		s1.setName("Pankaj");
		System.out.println(s1.getName());
		
		s1.setDeprt("MCA");
		System.out.println(s1.getDeprt());
		System.out.println(s1.toString());
		
		// tight coupling 
		Student s2 = new Student(100,"Pankaj","MCA");
		
		System.out.println(s2.toString());
		
		
		// to copy values of one object to another : through constructor
		Student s3 = new Student(s2);
		
		System.out.println(s3.toString());
		
		 

	}

}
