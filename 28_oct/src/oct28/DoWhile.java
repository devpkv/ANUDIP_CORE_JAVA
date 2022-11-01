package oct28;

import java.util.Scanner;

public class DoWhile {
	
	// method to print the table
	private static void printTable(int num)
	{
		 
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(num+" x "+ i +" = "+ (i*num));
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		do
		{
			System.out.println("Enter any number to print the table");
			int num = sc.nextInt();
			printTable(num);
			System.out.println("Are you want to print another table (y/n)?");
			choice = sc.next().toLowerCase();
			
		}
		while(choice.equals("y"));
		sc.close();

	}

}
