package com.objects.basics;

public class Bank {
	double balance;
	
	public Bank(double bal) {
		this.balance = bal;
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Balance:" +balance);
	}
	public void deposit(double amount) {
		amount = amount + balance;
		System.out.println("Amount:" +amount);
	}
	public double getBalance() {
		return balance;
	}
}
