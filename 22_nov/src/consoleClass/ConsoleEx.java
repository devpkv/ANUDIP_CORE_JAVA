package consoleClass;

import java.io.*;

public class ConsoleEx {

	public static void main(String[] args) {
		
		Console c = System.console();
		
		System.out.println("Enter user name :");
		String name = c.readLine();
		System.out.println("Enter password :");
		char[] p = c.readPassword();
		String password = String.valueOf(p);
		if(password.equals("admin"))
			System.out.println("Welcome, "+ name);
		else
			System.out.println("wrong password");
		

	}

}
