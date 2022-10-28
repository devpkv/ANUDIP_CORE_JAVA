package oct28;

public class WhileLoop {

	public static void main(String[] args) {
	 
		// print 1- 50 numbers
		int num = 1;
		while(num <= 50)
		{
			System.out.println(num);
			num++;
		}
		
		// IMPLEMENT BREAK;
		System.out.println("======= IMPLEMENT BREAK =========");
		num = 1;
		while(num <= 50)
		{
			if(num % 10 == 0)
				System.out.println(num);
			num++;
		}

	}

}
