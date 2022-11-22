package interfaces;

public class Intel implements A.B{

	public static void main(String[] args) {
		
		Intel i = new Intel();
		i.callB();
	}

	@Override
	public void callB() {
		// TODO Auto-generated method stub
		System.out.println("Nested interface method");
	} 

}

interface A{
	public void callA();
	interface B{
		public void callB();
	}
}
