class Casting{

	public static void main(String[] args) {
		
		byte num1 = 10;
		byte num2 = 20;
		// byte num =  (num1 + num2;  // Error possible lossy conversion from int to byte

		byte num =  (byte) (num1 + num2); 

		System.out.println(num);
		// To avoid type casting you can use like this;
		num1 += num2;
		System.out.println(num1);

	}
}