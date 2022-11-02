package constructors;

public class ConstructTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// without including marks
		Constructors c1 = new Constructors(123,"Pankaj");
		System.out.println(c1.toString());
		
		// including with marks
		
		Constructors c2 = new Constructors(123,"Pankaj",55);
		System.out.println(c2.toString());
	}

}
