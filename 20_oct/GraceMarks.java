import java.util.*;
class GraceMarks{

	// check marks and give grace marks to student
	private static void giveGraceMarks(float marks)
	{
		int grace = 0;
		if(marks >= 35 && marks <= 37) 
			grace = 5;
		else if(marks >= 38 && marks <= 39) 
			grace = 2;

		System.out.println("Grace marks given = "+ grace);
		System.out.println("Your marks now = "+ (grace+marks));
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your marks");
		float marks = sc.nextFloat();
		giveGraceMarks(marks);

	}

}