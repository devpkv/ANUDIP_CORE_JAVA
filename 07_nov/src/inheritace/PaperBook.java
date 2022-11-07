package inheritace;

public class PaperBook extends Book {
	int shipping_charges = 10;
	void print()
	{
		System.out.println(display());
		System.out.println("Shipping Charges : "+shipping_charges);
	}
	
	protected void type()
	{
		System.out.println("Paper");
	}
	public static void main(String[] args) {
		PaperBook pb = new PaperBook();
		pb.print();
		pb.type();
	}

}
