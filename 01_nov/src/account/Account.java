package account;

import java.util.Scanner;

public class Account {

	// Declaring instance variable 
	long accountNumber;
	String accountHolder;
	double balance;
	
	protected void setAccount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number : ");
		accountNumber = sc.nextLong();
		System.out.print("Enter account holder name : ");
		accountHolder = sc.next();
		System.out.print("Enter starting balance : ");
		balance = sc.nextDouble();
		sc.close();
	}
}
