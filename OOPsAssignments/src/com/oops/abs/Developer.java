package com.oops.abs;

public class Developer extends TeamLead {
	double chargesperHour; 
	String sportsName;
	public Developer(String empName, double salary, int empId, double chargesperHour, String sportsName) {
		super(empName, salary, empId);
		this.chargesperHour = chargesperHour;
		this.sportsName = sportsName;
	}
	void gamesClub(){ 
	    System.out.println(sportsName +""+ chargesperHour);
	}


}
