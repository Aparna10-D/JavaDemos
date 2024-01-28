package com.objects.override;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
	}
	@Override
	void withdraw(double amount) {
		
			balance = balance - amount; 
		System.out.println("Current withdrawal: "+amount);
	}
	@Override
	void deposit(double amount) {
			balance = balance + amount; 
		System.out.println("Current deposit: "+amount);
	}
	
}
