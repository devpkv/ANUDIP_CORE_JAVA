package constructors;

public class Constructors {

	int uid;
	String name;
	float marks;
	
	// default constructors
	public Constructors()
	{ 
		// default passing marks
		this.marks = 30.0f;
	}
	
	// parameterized constructors
	public Constructors(int uid, String name) {
		
		// calling default constructor 
		this(); 
		
		this.uid = uid;
		this.name = name; 
	}

	public Constructors(int uid, String name, float marks) {
		// calling parameterized method to assign the parameter
		this(uid,name);  
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Constructors [uid=" + uid + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
