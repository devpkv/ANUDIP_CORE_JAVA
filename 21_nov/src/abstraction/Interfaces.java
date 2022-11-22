package abstraction;

interface A{
	public void show();
	public void call();
}

interface B{
	public void display();
	
	public void call();
}
public class Interfaces implements A,B {

	public void show()
	{
		System.out.println("Show Inteface Method");
	}
	
	public void call()
	{
		System.out.println("Call Inteface Method");
	}
	
	public void display()
	{
		System.out.println("Display Inteface Method");
	}
	public static void main(String[] args) {
		 
		Interfaces i = new Interfaces();
		i.call();
		i.display();
		i.show(); 
	}

}
