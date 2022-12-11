package java8;

import java.util.*;
import java.util.function.Consumer;

public class ForEach2 {

	public static void main(String[] args) {
		
		List<String> data = new ArrayList<>();
		
		data.add("JAVA");
		data.add("Python"); 
		Demo d = new Demo();
		data.forEach(d);
	}

}

class Demo implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}

}



