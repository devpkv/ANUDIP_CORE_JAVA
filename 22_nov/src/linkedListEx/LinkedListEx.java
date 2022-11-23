package linkedListEx;
import java.util.LinkedList;
public class LinkedListEx {

	public static void main(String[] args) {
		 
		LinkedList<Integer> ll = new LinkedList<>();

		ll.add(4);
		ll.add(5);
		
		System.out.println(ll.size());
		
		System.out.println(ll.get(0));
		
		System.out.println(ll.contains(3));
		
		System.out.println(ll);
		ll.remove(0);
		System.out.println(ll);
		
		
	}

}
