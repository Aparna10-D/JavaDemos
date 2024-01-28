package com.oops.abs;

public class TeamLead extends Employee{

	public TeamLead(String empName, double salary, int empId) {
		super(empName, salary, empId);
	}

	@Override
	void calcBonus(double amount) {
		System.out.println(amount);
		
	}

	@Override
	String[] showCourses() {
		return showCourses();
	}

	@Override
	void showProjects() {
		System.out.println("The projects are displayed");
		
	}
	
	

}
