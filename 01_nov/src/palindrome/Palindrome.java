package palindrome;

import java.util.Scanner;

public class Palindrome {

	// creating a method to check number is palindrome or not
	private static boolean isPalindrome(int num)
	{
		int remainder;
		int reversedNum = 0;
		int temp = num;
		
		while(num > 0)
		{
			remainder = num % 10;
			reversedNum = (reversedNum * 10) + remainder;
			num /= 10;
		}
		
		if(reversedNum == temp)
			return true;
		
		return false;
	}
	
	// start main method
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		// input -> a number to check weather number is palindrome or not;
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		if(isPalindrome(num))
			System.out.println(num+" is a palindrome  number.");
		else
			System.out.println(num+" is not a palindrome  number.");
		
		sc.close();
	}
	
	// end main method

}
