package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//The Tomap method in java streams converts the elements of a stream into a map using a key and a value mapping function.
public class Tomap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Questions:Convert a list of strings into map where the key is the string and the value is its length.
        List<String> words=Arrays.asList("Apple","Banana","Cherry");
        Map<String, Integer> map=words.stream()
        		.collect(Collectors.toMap(Function.identity(),String::length));
        System.out.println(map);
	}

}
