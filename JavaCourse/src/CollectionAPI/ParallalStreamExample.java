package CollectionAPI;

import java.util.stream.IntStream;

public class ParallalStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = 0;
		long end = 0;

		start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(x -> System.out.println(x));
		end = System.currentTimeMillis();
		System.out.println("plain stream took time is:" + (end - start));

		System.out.println("--------------------------");

		start = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(x -> System.out.println(x));
		end = System.currentTimeMillis();
		System.out.println("took time for parallel stream:" + (end - start));
	}

}
