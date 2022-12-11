package java8API;

public interface java8interface {

	int squre(int x);
	
	default String welcome()
	{
		return "Welcome";
	}
	
	static String thanks()
	{
		return "Thank you";
	}
	
	
}
