package com.cybertek.tests.o1_intellij_shortcuts;

public class Employee {

	// instance variable
	String Name;
	String ID;
	int age;
	int SSN;
	String JobTitle;
	double salary;
	
	public Employee(String Name, String ID, int age, int SSN, String JobTitle, double salary) {
					// local variable
		this.Name=Name;
		this.ID=ID;
		this.age=age;
		this.SSN=SSN;
		this.JobTitle=JobTitle;
		this.salary=salary;
		
		
	}
	
	
	public void getInfo() {
		System.out.println("Employee name is: "+Name);
		System.out.println("Social Security number is: "+SSN);
		System.out.println("Age is: "+age);
		System.out.println("Job title is: "+ JobTitle);
		System.out.println("Employee; ID is: "+ID);
		System.out.println("Salary is: $"+salary);
		
	}
}
