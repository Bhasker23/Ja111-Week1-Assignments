package com.Day4.Problem1;

public class Student {

	private int roll;
	private String name;
	private int age;
	private int marks;
	
    public Student() {
		// TODO Auto-generated constructor stub
	}
    
    public Student(int roll,String name,int age,int marks) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
    
    public void setRoll(int roll) {
		this.roll = roll;
	}
    public int getRoll() {
		return roll;
	}
    
    
    public void setName(String name) {
		this.name = name;
	}
    public String getName() {
		return name;
	}
    
    public void setAge(int age) {
		if (age >= 18 && age <= 60) {
			this.age = age;
		}
		
    	
	}
    public int getAge() {
		return age;
	}
    
    
    public void setMarks(int marks) {
    	if (marks <= 0 && marks >= 500) {
    		this.marks = marks;
		}
		
	}
    
    
    public int getMarks() {
		return marks;
	}
    
    
    public void showStudentDetails() {
    	
    	System.out.println("Student 1 Details");
    	System.out.println("------------------");
		System.out.println("Roll  is : " + roll);
		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age );
		System.out.println("Marks is : " + marks);
	}
	 
}
