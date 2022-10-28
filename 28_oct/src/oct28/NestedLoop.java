package oct28;

public class NestedLoop {

	private static void nestedLoop()
	{
		System.out.println("+++++++++++Nested Loop++++++++++");
		// outer is a label of for loop/name
		for(int i = 1; i <= 5; i++)
		{
			 
			for(int k = 1; k <= 5; k++)
			{
				 
				if(i == k) 
				{
					System.out.println(i+" = "+k); 
					break;
				}
				
			}
		}
	}
	public static void main(String[] args) {
		
		nestedLoop();

	}

}
