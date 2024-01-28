package com.objects.override;

public class Account {

	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	void withdraw(double amount) {
		System.out.println("Withdraw:" +amount);
	}
	void deposit(double amount) {
		System.out.println("Deposit:" +amount);
	}
	double  getBalance() {
		return balance;
	}
}
