import java.util.Scanner;
class NestedIfElse{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age.");
		int age = sc.nextInt();

		if(age>=18)
		{
			System.out.println("Enter you weight");
			float weight = sc.nextFloat();
			System.out.println("Enter you gender (m/f)");
			char gender = sc.next().charAt(0);

			if((weight >= 60 && gender == 'm') || (weight >= 50 && gender == 'f'))
				System.out.println("You can donate your blood.");
			else
				System.out.println("You cannot donate your blood, better luck next time.");
		}
		else
			System.out.println("You are under age. Better luck next time.");
	}
}