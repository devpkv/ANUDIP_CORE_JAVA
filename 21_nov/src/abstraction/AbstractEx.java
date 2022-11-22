package abstraction;

public class AbstractEx extends Abs1{
	
	public void display()
	{
		System.out.println("Derived abstract");
	}
	
	public static void main(String[] args)
	{
		AbstractEx ax = new AbstractEx();
		ax.display();
		ax.print();
	}
}


abstract class Abs1{
	
	abstract public void display();
	
	public void print()
	{
		System.out.println("print method");
	}
}