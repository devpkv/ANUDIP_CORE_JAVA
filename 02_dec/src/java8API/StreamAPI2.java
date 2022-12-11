package java8API;

import java.util.stream.Stream;

public class StreamAPI2 {

	public static void main(String[] args) {

		Stream.iterate(1, num->num+1)
			.filter(num->num%5 == 0)
			.limit(5)
			.forEach(System.out::println);

	}

}
