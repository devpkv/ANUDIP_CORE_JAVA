package maps;

import java.util.*;

public class TreeMapEx {

	public static void main(String[] args) {
		 
		Map<String,Integer> m = new TreeMap<>();
		
		m.put("key1", 1);
		m.put("key4", 10);
		m.put("key2", 13);
		m.put("key10", 13);
		m.put("a", 43);
		//m.put(null, 43); // null pointer exception occurs
		System.out.println(m);
		System.out.println(m.keySet());
	}

}
