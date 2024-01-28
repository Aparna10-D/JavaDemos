package com.objects.basics;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Bank bc = new Bank(2000);
		Scanner scanner = new Scanner(System.in);
		 String input = scanner.next();
		 System.out.println("Withdraw/Deposit:withdra "+input);
		 switch(input) {
		 case "withdraw":
			 System.out.println("Withdraw");
			 bc.withdraw(300);
			 break;
		 case "deposit" :
			 System.out.println("Deposit");
			 bc.deposit(500);
			 break;
		default:
			System.out.println("Wrong input");
		 }
			scanner.close();
	}

}
