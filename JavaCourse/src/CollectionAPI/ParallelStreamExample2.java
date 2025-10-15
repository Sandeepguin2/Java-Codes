package CollectionAPI;

import java.util.stream.IntStream;

public class ParallelStreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=0;
		long end=0;
		
		start=System.currentTimeMillis();
		IntStream.range(1, 1000).forEach(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("Took time for normal stream:"+(end-start));
		
		System.out.println("--------------------------");
		
		start=System.currentTimeMillis();
		IntStream.range(1, 1000).parallel().forEach(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("Took time for parallel stream:"+(end -start));
		
		
		

	}

}
