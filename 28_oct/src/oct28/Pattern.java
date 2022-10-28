package oct28;

public class Pattern {

	public static void pattern1(int lines)
	{
		for(int i = 1; i <= lines; i++)
		{
			// new iteration for printing pattern
			for(int p = 1; p <= i; p++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern2(int lines)
	{
		for(int i = lines; i >= 1; i--)
		{
			 
			for(int j = 1; j <= lines; j++)
			{
				if(j == i)
				{
					for(int k = 1; k <= (lines - j); k++)
						System.out.print("* ");
					
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		 
	}
	public static void main(String[] args) {
		 
		pattern1(10);
		pattern2(5);
	}

}
