package enums;

public class Enum {
	//An enum is a special "class" that represents a group of constants 
	//(unchangeable variables, like final variables)
	enum Fruit{
		MANGO(1),
		BANANNA(2),
		PINAPPLE(3);
		 
		int i;
		Fruit(int i)
		{
			this.i = i;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Fruit f: Fruit.values())
		{
			System.out.println(f+"=>"+f.i);
		}
	}

}
