package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//The counting method in java streams is a collector that contains the number of elements in the stream.Its often used in conjuction with other collectors for agggregation.
public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question:Count the number of strings in a list
		//used in integer or string
		List<String> words=Arrays.asList("Apple","banana","Cherry");
		Long count=words.stream()
				.collect(Collectors.counting());
		System.out.println(count);
		

	}

}
