package StreamOperations;

import java.util.Arrays;
import java.util.List;

//Converts a stream of objects (Stream<T>) into an IntStream.

//Useful for extracting integer values from objects.
public class Maptoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

	        int sum = numbers.stream()
	                         .mapToInt(Integer::intValue) // Stream<Integer> → IntStream
	                         .sum();

	        double avg = numbers.stream()
	                            .mapToInt(Integer::intValue)
	                            .average()
	                            .getAsDouble();
	        //getAsDouble()->If a value is present, returns the value, otherwise throws NoSuchElementException.
			

	        int max = numbers.stream()
	                         .mapToInt(Integer::intValue)
	                         .max()
	                         .getAsInt();

	        System.out.println("Sum = " + sum);
	        System.out.println("Average = " + avg);
	        System.out.println("Max = " + max);

	}

}
