nclass Shift {
	public static void main(String[] args) {
		
		int a = 10;

		System.out.println(++a + a-- + ++a + a++ - --a + a++);

		a = 10;
		int total = 0;
		total += ++a;
		System.out.println("++a = "+ a + " Total = "+total);
		total += a--;
		System.out.println("a-- = "+ a + " Total = "+total);
		total += ++a;
		System.out.println("++a = "+ a + " Total = "+total);
		total += a++;
		System.out.println("a++ = "+ a + " Total = "+total);
		total -= --a;
		System.out.println("--a = "+ a + " Total = "+total);
		total += a++;
		System.out.println("a++ = "+ a + " Total = "+total);
		System.out.println(total);
		System.out.println(~5);
	}
}