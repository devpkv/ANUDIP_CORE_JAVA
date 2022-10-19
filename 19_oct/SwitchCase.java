import java.util.Scanner; 
class SwitchCase
{ 
	static void getDay(int d)  
	{	
	
	   // days case
	   switch(d)
	   {
		   case 1:System.out.println("Monday");
		          break;
		   case 2:System.out.println("Tuesday");
		          break;
		   case 3:System.out.println("Wednesday");
		          break;
		   case 4:System.out.println("Thursday");
		          break;
		   case 5:System.out.println("Friday");
		          break;
		  case 6:System.out.println("Saturday");
		          break;
		  case 7:System.out.println("Sunday");
		          break;
		  default: System.out.println("Wrong input");
				  
	   }
	 
	} 
	
	 
	public static void main(String args[])
	{
	
	  
		Scanner sc = new Scanner(System.in); 
		int day;
		System.out.println("Enter the day number:");
		day= sc.nextInt(); 
		getDay(day);
		
	
		
		    
	}
		
	 
} 