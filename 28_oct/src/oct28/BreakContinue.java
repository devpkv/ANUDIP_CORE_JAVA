package oct28;

public class BreakContinue {

	public static void mdBreak()
	{ 
		// Stop iteration when a number divide by 5
		System.out.println("+++++++ BREAK ++++++++");
		for(int i = 1; i < 10; i++)
		{
			if(i%5 == 0)
			{
				 
				break;
			}
			
			System.out.println(i);
		}
	}
	
	public static void mdContinue()
	{ 
		System.out.println("+++++++ CONTINUE ++++++++");
		// skip 5th iteration and continue with next iteration
		for(int i = 1; i < 10; i++)
		{
			if(i == 5) 
				continue;
			
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		 
		
		mdBreak();
		mdContinue();
	}

}
