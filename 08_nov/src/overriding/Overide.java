package overriding;

public class Overide {

	public static void main(String[] args) {
		 
		Person p = new Person();
		Employee e = new Employee();
		Student s = new Student();
		
		Person ref;
		
		ref = p;
		ref.showDetails();
		ref = e;
		ref.showDetails();
		ref = s;
		ref.showDetails();
		
		

	}

}
