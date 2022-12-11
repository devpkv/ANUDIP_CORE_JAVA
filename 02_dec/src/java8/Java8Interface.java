package java8;

public interface Java8Interface {

	void add();
	void delete();
	
	default String welcome() {
		return "Welcome to our class";
	}
	
	default String thanks() {
		return "Thanks for participation";
	}
	
	static int noStudent(int num) {
		return ++num;
	}
}
