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
	public static void main(String[] args) {
		 
		pattern1(10);
		pattern2(5);
	}

}
