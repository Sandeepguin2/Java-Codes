package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//The Mapping method is used to apply a mapping function to element in a stream and then collect the results using another collector.
public class MappingWithDownstreamCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question:Collect the lengths of all strings in a list and sum them.
		List<String> words = Arrays.asList("Apple", "Banana", "Cherry");
		int totalLength = words.stream()
				.collect(Collectors.mapping(String::length, Collectors.summingInt(Integer::intValue)));
		System.out.println(totalLength);
	}

}
