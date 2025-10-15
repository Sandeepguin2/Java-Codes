package StreamOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sSortListOfStringsiNIncreasingOrderOfTheriLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> values=Arrays.asList("Sandeep","Lipsa","rama");
		List<String> v=values.stream()
				.sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());
		System.out.println(v);

	}

}
