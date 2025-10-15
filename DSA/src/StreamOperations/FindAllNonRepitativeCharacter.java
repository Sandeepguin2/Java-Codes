package StreamOperations;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllNonRepitativeCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sandeep";
		List<Character> nonrepitive = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(nonrepitive);

	}

}
