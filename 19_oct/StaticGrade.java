import java.util.Scanner; 
class StaticGrade
{
	// calculate grade
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
		
	}
	 
	 
	public static void main(String args[])
	{
		 
		Scanner sc = new Scanner(System.in);
		
	 
		float per;
			
		 
		System.out.println("Enter the percentage:");
		percentage= sc.nextFloat();
		
		 
		checkGrade(per); 
		
		    
	}
		
	 
}