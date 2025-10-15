package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithSToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("sandeep","amit","namit","surya");
		List<String> values=names.stream()
				.filter(str->str.startsWith("s"))
				.map(str->str.toUpperCase())
				.collect(Collectors.toList());
		values.forEach(System.out::println);

	}

}
