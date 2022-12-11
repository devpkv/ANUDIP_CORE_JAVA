package java8;

public class FunctionalInterfaceEx implements Shapes{

	
	public static void main(String[] arg) {
		
		int side = 10;
		Shapes s = (int x) -> x * x;
		int area = s.square(side);
		System.out.println(area);
	}

	@Override
	public int square(int x) {
		// TODO Auto-generated method stub
		return 0;
	}
 
}
