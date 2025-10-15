package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//The CollectingThen method in java Streams is a collector that first applies a collection operation and then applies another function to the result
public class CollectingThen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question:Convert a stream of strings into set and then gets its size.
		//used in string 
		List<String> words=Arrays.asList("Apple","banana","cherry","Banana");
		int size=words.stream()
				.collect(Collectors.collectingAndThen(Collectors.toSet(), Set::size));
		System.out.println(size);

	}  

}
