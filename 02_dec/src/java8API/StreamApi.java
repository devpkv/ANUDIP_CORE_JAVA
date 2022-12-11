package java8API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {

	String name;
	int marks;
	
	public Student(String name, int marks) {
		
		this.name = name;
		this.marks = marks;
		
	}
	
	public String toString()
	{
		return this.name+" "+this.marks;
	}
	
	

}


public class StreamApi{
	
	public static void main(String[] args) {

		List<Student> s = new ArrayList<>();
		
		s.add(new Student("aa", 90));
		s.add(new Student("bb", 30));
		s.add(new Student("cc", 50));
		s.add(new Student("dd", 80));
		
		List<Integer> m = s.stream().filter(p->p.marks < 60)
				            .map(p->p.marks)
				            .collect(Collectors.toList());
		
		System.out.println(m);

	}
}