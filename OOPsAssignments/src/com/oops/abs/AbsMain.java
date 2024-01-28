package com.oops.abs;

public class AbsMain {

	public static void main(String[] args) {
		Employee employee = new Manager("Anu", 50000.0,10, "Musical chair");
		employee.calcBonus(200);
		employee.empName = "Charu";
		employee.printDetails();
		employee.showCourses();
		employee.showProjects();
		employee.showRules();
		
		Manager manager = (Manager)employee;
		manager.funClub();
		manager.calcBonus(3000);
		manager.printDetails();
		
		employee = new Developer("Amu", 20000, 70, 90,"Tennis");
		
	   TeamLead teamlead = (TeamLead)employee;
	   teamlead.showRules();
	   teamlead.calcBonus(200);
	   teamlead.showProjects();
	   
	   Developer developer  = (Developer) employee;
	   developer.gamesClub();
	   
	    
	    
		
		

	}

}
