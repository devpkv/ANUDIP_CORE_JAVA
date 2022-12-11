package java8API;
import java.util.*;
import java.util.function.Consumer;
public class ForEachEx {

	public static void main(String[] args) {
		 
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		
		al.forEach(new Consumer() {

			@Override
			public void accept(Object t) {
				
				System.out.println(t);
				
			}
			
		});

	}

}
