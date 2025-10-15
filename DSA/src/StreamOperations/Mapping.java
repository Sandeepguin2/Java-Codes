package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//The Mapping method in java stream is used to apply a mapping function to the element of a stream and then collect the result using another collector.
//RETURN TYPE:A Collector that applies a mapping function and collects the results
public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Questions:Extract and collect the lengths of all strings in a list.
		List<String> words=Arrays.asList("Apple","banana","Cherry");
		List<Integer> length=words.stream()
				.collect(Collectors.mapping(String::length, Collectors.toList()));
		System.out.println(length);

	}

}
