package com.objects.override;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the account:");
		String accountType = sc.next();
		if(accountType.equalsIgnoreCase("Current") || accountType.contains("Business")){
			Account withdraw1 = new Current(30000);
			System.out.println("Current account balance: "+ withdraw1.getBalance());
			withdraw1.withdraw(10000);
			System.out.println("Balance: " +withdraw1.getBalance());
			Account deposit1 = new Current(withdraw1.getBalance());
			deposit1.deposit(4000);
			System.out.println("Current account balance now: "+ deposit1.getBalance());
		}
		
		else if (accountType.equalsIgnoreCase("Savings") || accountType.contains("Personal")){
			Account withdraw1 = new Savings(20000);
			System.out.println("Savings account balance: "+ withdraw1.getBalance());
			withdraw1.withdraw(1000);
			System.out.println("Balance: " +withdraw1.getBalance());
			Account deposit1 = new Savings(withdraw1.getBalance());
			deposit1.deposit(10050);
			System.out.println("Savings account balance now: "+ deposit1.getBalance());

		}
		else {
			Account account = new Account(5000);
			System.out.println("Balance :"+account.getBalance());
		}
		sc.close();
	}

}
