import java.util.*;
class Attendance{
	// checking user is eligible for exam or not
	private static void checkEligblity(int totalClasses, int attendedClasses)
	{
		int criteria_per = 75;
		if((totalClasses * criteria_per / 100 ) <= attendedClasses) 
			System.out.println("You are eligible for upcoming exam... "); 
		else
		 	System.out.println("You are not eligible for upcoming exam... "); 
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// input -> Total classes
		System.out.print("Total number of classes ? = ");
		int totalClasses = sc.nextInt();

		// input -> Total attended classses
		System.out.print("Total number of classes you attended? = ");
		int attendedClasses = sc.nextInt();
		checkEligblity(totalClasses, attendedClasses);
	}
}