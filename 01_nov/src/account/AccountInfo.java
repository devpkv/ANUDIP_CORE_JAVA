package account;

import java.util.Scanner;

public class AccountInfo {

	private static void menu() {
		
		System.out.println("1. View Account Balance ");
		System.out.println("2. Account Detail's ");
		System.out.println("3. Withdrawal "); 
		System.out.println("4. Exit ");
	}
	public static void main(String[] args) {

		Account aObj = new Account();
		Scanner sc = new Scanner(System.in);
		short ch;
		do {
			System.out.println("Enter the account detail's:");
			aObj.setAccount();
			menu();
			
			System.out.println("Are you want to perform another operation (y=1/n=0)");
			ch = sc.nextShort();
			
		}while(ch == 1);
		sc.close();
	}

}
