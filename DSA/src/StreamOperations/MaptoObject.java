package StreamOperations;

import java.util.stream.IntStream;
import java.util.stream.Stream;

//Converts a primitive stream (IntStream, DoubleStream, LongStream) into a stream of objects (Stream<T>).
//Useful when you want to transform primitives into wrapper objects or custom objects.
public class MaptoObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question:IntgerTosStringObject
		IntStream intStream = IntStream.of(1, 2, 3, 4);

		// Convert IntStream → Stream<String>
		Stream<String> stringStream = intStream.mapToObj(i -> "Number :  " + i);

		stringStream.forEach(System.out::println);

		

	}

}
