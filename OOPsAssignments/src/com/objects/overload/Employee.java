package com.objects.overload;

public class Employee {
	String name;
	String designation;
	
	
	/*public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;*/
	//}
	double calcBonus(double basicAllowance) {
		return(basicAllowance);
	}
    double calcBonus(double basicAllowance, double carAllowance) {
		return(basicAllowance + carAllowance);
    }
    double calcBonus(double basicAllowance, double carAllowance, double houseAlllowance ) {
		return(basicAllowance +carAllowance + houseAlllowance);
    }
}
