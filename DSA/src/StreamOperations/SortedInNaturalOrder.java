 package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedInNaturalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Sandeep","Sanjeeb","Rinku","raja");
		List<String> Unames=names.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(Unames);

	}

}
