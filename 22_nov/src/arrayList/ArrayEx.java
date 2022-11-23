package arrayList;
 
import java.util.*;

public class ArrayEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(3); 
		al1.add(6);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		
		al2.add(1);
		al2.add(2);
		al2.add(4);
		al2.add(5);
		
		// extends array 1 al1 elements to array 2 al2
		
		al2.addAll(al1);
		
		System.out.println(al2);
		
		// Sorting array elements
		Collections.sort(al2);
		
		// sorted array elements
		System.out.println(al2);
		
		
		// size of array
		
		System.out.println("Size of array 2 is : "+ al2.size());
		
		// remove elements by using index number
		al2.remove(0);
		
		System.out.println("After elements removed " + al2);
		
		// size of array
		
		System.out.println("Size of array 2 is : "+ al2.size());
		
		// removed array 1 elements from array 2
		
		al2.removeAll(al1);
		
		System.out.println("After array 1 elements removed " + al2);
		
		// clear all array elements from 
		al1.clear();
		System.out.println("Cleared Array 1 elements "+ al1.size());
		al2.clear();
		System.out.println("Cleared Array 2 elements "+ al2.size());
	}

}
