package inheritace;

public class Child extends Base{

	 
	public void full(int a)
	{
		System.out.println("Derived Parameter");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		 
		c.full(4);
	}

}
