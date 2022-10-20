import java.util.*;
class Calculator
{
	// add operation method
	static void add(float n1, float n2)
	{
		float result = n1 + n2;
		System.out.println("The result is = "+result);
	}

	// subtract operation method
	static void subtract(float n1, float n2)
	{
		float result = n1 - n2;
		System.out.println("The result is = "+result);
	}

	// multiply operation method
	static void multiply(float n1, float n2)
	{
		float result = n1 * n2;
		System.out.println("The result is = "+result);
	}

	// divide operation method
	static void divide(float n1, float n2)
	{
		float result = n1 / n2;
		System.out.println("The result is = "+result);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// input two numbers
		System.out.println("Enter two numbers :");
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();

		// displaying the choices
		System.out.println("1. Add ");
		System.out.println("2. Subtract ");
		System.out.println("3. Multiply ");
		System.out.println("4. Divide ");
		System.out.println("5. Exit ");
		System.out.print("Enter the choice : ");
		int choice = sc.nextInt();
		// start switch case 
		switch(choice)
		{
			case 1 : add(n1,n2);
					break;
			case 2 : subtract(n1,n2);
					break;
			case 3 : multiply(n1,n2);
					break;
			case 4 : divide(n1,n2);
					break;
			case 5 : System.exit(0);
					break;
			default : System.out.println("Wrong Input!");
		}
		// end switch statement
	}
}