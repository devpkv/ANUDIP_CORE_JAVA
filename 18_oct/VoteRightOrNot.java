import java.util.*;
class VoteRightOrNot{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age to check weither you are allowed to vote or not: ");
		int age = sc.nextInt();

		if(age >= 18)
			System.out.println("You are allowed to vote");
		else
			System.out.println("You are not allowed to vote");
	}

	
}