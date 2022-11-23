package sets;

import java.util.*;

public class Hashset {

	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<>(); 
		Set<Integer> s2 = new HashSet<>();
		s1.add(40);
		s1.add(50); 
		s1.add(60); 
		
		s2.add(41);
		s2.add(20);
		s2.add(44); 
		s2.add(50);
		s2.add(60);
		System.out.println(s1); 
		System.out.println(s2); 
		//s1.addAll(s2); // copy all elements to s1 set
		
		System.out.println(s2.retainAll(s1));
		Iterator<Integer> i2 = s2.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		if(s2.containsAll(s1))
		{
			System.out.println("S1 is subset of S2");
		}
		else
			System.out.println("S1 is subset of S2");
		Iterator<Integer> i = s1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
