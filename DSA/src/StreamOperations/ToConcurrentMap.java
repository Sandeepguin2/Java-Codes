package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//The toConcurrentMap method in java streams is similar to toMap, but it produces a concurrentmap for thread safe operations.When multiple threads might access or, modify the map simultaneously ensures that the resulting map is thread safe and can be safely used in concurrent environments.
public class ToConcurrentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question:Convert a list of strings into a concurrent map where the key is the string and the value is its length.
        List<String> words=Arrays.asList("Apple","banana","Cherry");
        ConcurrentMap<String, Integer> map=words.stream()
        		.collect(Collectors.toConcurrentMap(Function.identity(),String::length));
        System.out.println(map);
	}

}
