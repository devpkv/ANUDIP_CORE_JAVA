package java8;

import java.util.*;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> data = new ArrayList<>();
		
		data.add("JAVA");
		data.add("Python");
		data.add("Php");
		
		data.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
			
		});

	}

}
