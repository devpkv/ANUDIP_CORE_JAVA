import java.util.Scanner; 
class Variable
{
	// instance variable or class variable
	int age ;
	static int year;
	String name;
		
    // default values 
   /*  	int : 0 
	    float = 0.0f 
	    double =0.0
	    string = null	
     */
		
	
	public static void main(String args[])
	{
     //static int m =90; it can not be made inside a class.
	 
	 // System.out.println(age); we cannot call a non static member from static method
	 
	 System.out.println(year);// static can be called from static method
	 
	 int local;
	 
	 // to call non static
	 Variable v1= new Variable();
	 System.out.println(v1.age);
	 System.out.println(v1.name);
	 
	  //System.out.println(local); has to be intialized
	  
		    
	}
		
}