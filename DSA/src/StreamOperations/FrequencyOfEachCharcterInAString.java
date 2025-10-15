package StreamOperations;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharcterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sandeep";
		Map<Character, Long> values = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(values);

	}

}
