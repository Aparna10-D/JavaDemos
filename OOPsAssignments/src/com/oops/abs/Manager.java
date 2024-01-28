package com.oops.abs;

public class Manager extends Employee{
	 String activity; 
	 
	public Manager(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId);
		this.activity = activity;
	}
	 void funClub(){ 
	   System.out.println("Activity "+activity); 
	 }
	@Override
	void calcBonus(double amount) {
		System.out.println("Bonus:" +amount+500);
	}

	@Override
	String[] showCourses() {
		return showCourses();
	}
	@Override
	void showProjects() {
		System.out.println("projects");
	}
}