package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Joining:-It is used to concatenate the elements of a stream in to single string.Its part of the collectors utility class and provide a convenient way to aggregate elements into a string format with optional delimiters , prefix and suffixes.
public class Joining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words=Arrays.asList("Apple","banana","mango");
		String result=words.stream()
				.collect(Collectors.joining(","));
		System.out.println(result);

	}

}
