package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("sandeep","sanjeeb","raja","rinku");
		List<String> lower=names.stream()
				.map(str->str.toLowerCase())
				.collect(Collectors.toList());
		lower.forEach(n->System.out.println("name"+":"+n));

	}

}
