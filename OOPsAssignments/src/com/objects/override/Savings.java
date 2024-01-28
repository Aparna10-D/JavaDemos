package com.objects.override;

public class Savings extends Account{

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	//Account withdraw = new withdraw();
	//Account deposit = new deposit();
	@Override
	void withdraw(double amount) {
			balance = balance - amount ; 
		System.out.println("Savings Withdrawal:"+amount);
	}
	@Override
	void deposit(double amount) {
			balance= balance + amount + 200;
		System.out.println("Savings deposit: "+amount);
		
	}
}