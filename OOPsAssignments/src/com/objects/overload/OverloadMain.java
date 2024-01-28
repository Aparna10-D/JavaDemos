package com.objects.overload;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		//Employee emp = new Employee("Anu", "Director");
		//Employee emp2 = new Employee("Sunny", "Manager");
		//Employee emp3 = new Employee("Ram", "Programmer");
		//String designation = emp3.designation;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter designation: ");
		String des = sc.next();
		Employee emp = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		if(des.equalsIgnoreCase("Manager"))
			System.out.println("Bonus: "+ name + emp.calcBonus(5000));
		else if(des.equalsIgnoreCase("Programmer"))
			System.out.println("Bonus: "+ name + emp2.calcBonus(2*500.8, 20000.0));
		else 
			System.out.println("Bonus: " + name + emp3.calcBonus(2000, 400000, 6000));	
		sc.close();
	
		}
	
}