import java.util.Scanner;
class StudentReportCard
{

	static void totalPercentage(float marks1,float marks2, float marks3)
	{
		float percentage; 
		percentage= ((marks1+marks2+marks3)/300)*100; 
		checkGrade(percentage);
		 
	}
	

	static void checkGrade(float percentage) // formal/dummy arguments
	{	
	  char grade;
		//checking percentage to calculate grade
		if(percentage>=85)
	     	 grade='A';
		 else if(percentage>=70)
			  grade='B';
		      else if(percentage>=55)
				    grade='C';
	                 else if(percentage>=40)
                           grade='D';
                           else
                             grade='F';  
						 
			   			
	 
    	if(grade=='F') 
	      System.out.println("Sorry!! You have failed... Work hard next time");
	   	else
            System.out.println("You have cleared the exam with grade:"+grade);

        remarks(grade);		   
	
	}

	static void remarks(char grade) // taking grade as argument
	{	
	
	  
	   switch(grade)
	   {
		   case 'A':System.out.println("Excellent performance...");
		          break;
		   case 'B':System.out.println("Good...");
		          break;
		   case 'C':System.out.println("Average...can do better");
		          break;
		   case 'D':System.out.println("Pass.. Need to work very hard");
		          break;
		   case 'F':System.out.println("Fail... Better luck next time");
		          break;
		  default: System.out.println("Wrong input");
				  
	   }
	  
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		float marks1,marks2,marks3;
		
	 
		System.out.println("Enter the marks of subject 1:");
		marks1= sc.nextFloat();
		System.out.println("Enter the marks of subject 2:");
		marks2= sc.nextFloat();
		System.out.println("Enter the marks of subject 3:");
		marks3= sc.nextFloat();
		 
		totalPercentage(marks1,marks2,marks3);
	}
}