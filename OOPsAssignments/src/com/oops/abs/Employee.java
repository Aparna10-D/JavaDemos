package com.oops.abs;

public abstract class Employee {
	String empName;
	double salary;
	int empId; 
	final String COMPANYNAME="";
	public Employee(String empName, double salary, int empId) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.empId = empId;
	} 
	void printDetails(){
		System.out.println("Employee name: "+empName);
		System.out.println("Employee salary: "+salary);
		System.out.println("Employee ID: "+empId);
		} 
	abstract void calcBonus(double amount); 
	abstract String[] showCourses(); 
	
	 abstract  void showProjects(); 
	 final void showRules(){ 
		 officeHours();
	  System.out.println("leave policies"); 
	  System.out.println("od policies"); 
	 
	}  
	private void officeHours(){ 
	  System.out.println("10 hours per day"); 
	 } 
	 
}
