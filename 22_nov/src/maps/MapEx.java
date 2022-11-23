package maps;

import java.util.*;

public class MapEx {

	public static void main(String[] args) {
		
		Map<Character, Integer> m = new HashMap<>();
		
		m.put('A', 65); 
		m.put('C', 67);
		m.put('B', 66);
		m.put(null, 66); // hash map allow null keys
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		m.remove('A');
		System.out.println(m);
		System.out.println(m.get('B'));
	}

}
