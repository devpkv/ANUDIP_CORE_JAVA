package com.student;

public class Student {

	private int id;
	private String name;
	private String deprt;
	
	// creating default constructor
	public Student()
	{
		System.out.println("---------------- Default Constructor ---------");
	}
	
	public Student(int id, String name, String deprt)
	{
		System.out.println("---------------- Parmetrized Constructor ---------");
		
		this.id = id;
		this.name = name;
		this.deprt = deprt;
	}
	
	
	public Student(Student s)
	{
		System.out.println("---------------- Copy Constructor ---------");
		
		this.id = s.id;
		this.name = s.name;
		this.deprt = s.deprt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeprt() {
		return deprt;
	}

	public void setDeprt(String deprt) {
		this.deprt = deprt;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", deprt=" + deprt + "]";
	}
	
	
	
	
	

}
