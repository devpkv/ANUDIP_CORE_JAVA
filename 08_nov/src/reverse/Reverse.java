package reverse;

public class Reverse {

	private static void reverse(String str)
	{
		int len = str.length(); 
		for(int i = len-1; i >= 0; i--)
		{ 
			System.out.print(str.charAt(i));
		} 
	}
	public static void main(String[] args) {
		 
		reverse("hello world");
	}

}
