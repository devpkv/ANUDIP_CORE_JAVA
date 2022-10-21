import java.util.*;
class GroceoryBill{
	
	// displaying groceory menu to the user
	private static void menu()
	{  

		// Groceory available option
		System.out.println("Groceory Store :");
		System.out.println("1. Potato : Rs. 24/kg");
		System.out.println("2. Tomato : Rs. 50/kg");
		System.out.println("3. Apples : Rs. 100/kg");
		System.out.println("4. Custard apple : Rs. 80/kg");
		System.out.println("5. Orange : Rs. 105/kg");
		buyGroceoryItem();
	}

	private static void buyGroceoryItem()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose what you want to purchase : ");
		int choice = sc.nextInt(); 
		switch(choice)
		{
			case 1: setGroceoryQuantity("Potato", 24);
				break;
			case 2: setGroceoryQuantity("Tomato", 50);
				break;
			case 3: setGroceoryQuantity("Apples", 100);
				break;
			case 4: setGroceoryQuantity("Custard apple", 80);
				break;
			case 5: setGroceoryQuantity("Orange", 105);
				break;
			default : System.out.println("Wrong Input!");
		} 
	}

	// taking quantity input from user
	private static void setGroceoryQuantity(String item, float price)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the quantity = ");
		float qyt = sc.nextFloat();   
		groceoryBill(item, price, qyt);
	}


	// calculating bill
	private static void groceoryBill(String item, float price, float qyt)
	{
		float totalBill = price * qyt;
	 
		System.out.println("Your total groceory bill is Rs. " + totalBill); 
		float discount = calcDiscount(totalBill);
		if(discount > 0)
		{
			System.out.println("-----------TOTAL DISCOUNT--------------  \n "+discount);
			System.out.println("----------- Net. groceory bill --------- \n"+(totalBill - discount));
		}
	}

	// calculating discount
	private static float calcDiscount(float totalBill)
	{
		 
		float discount = 0.0f;
		if(totalBill >= 2000)
			discount = 20;
		else if(totalBill >= 500)
			discount = 10;
		else if(totalBill >= 250)
			discount = 5;

		if(discount > 0)
			System.out.println("Congratulation, you are eligible for "+discount+"% discount");

		return totalBill * discount / 100;
	}


	public static void main(String[] args) {
		
		menu();
	}
}