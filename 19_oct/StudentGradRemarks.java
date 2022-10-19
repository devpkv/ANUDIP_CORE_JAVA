import java.util.Scanner;
class StudentGradRemarks
{

	static void remarks(char grade) // taking grade as argument
	{	
	
	  
	   switch(gr)
	   {
		   case 'A':System.out.println("Excellent performance...");
		          break;
		   case 'B':System.out.println("Very Good...");
		          break;
		   case 'C':System.out.println("Good...can do better");
		          break;
		   case 'D':System.out.println("Fair.. Need to work very hard");
		          break;
		   case 'F':System.out.println("Fail... Better luck next time");
		          break;
		  default: System.out.println("Wrong input");
				  
	   }
	  
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		char grade;
		System.out.println("Enter the grade:");
		grade= sc.next().charAt(0);
		
		 
		remarks(grade);	
	}
}