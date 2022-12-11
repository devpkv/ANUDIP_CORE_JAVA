package java8;

public class JavaClass implements Java8Interface{

	public static void main(String[] args) {
		 
		JavaClass jc = new JavaClass();
		String company = "Anudip: ";
		company = company + jc.welcome();
		System.out.println(company);
		jc.add();
		jc.delete();
		System.out.println(jc.thanks());
		System.out.println(Java8Interface.noStudent(5)); 
	}

	@Override
	public void add() {
		System.out.println("Student Added");
		
	}

	@Override
	public void delete() {
		System.out.println("Student Removed");
		
	}

}
