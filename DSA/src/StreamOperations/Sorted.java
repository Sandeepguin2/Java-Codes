package StreamOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Questions:Sort a list of names in reverse alphabetical order.
public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names =Arrays.asList("Aditi","Sandeep","Vicky","Rohit","Chandrika");
		List<String> result=names.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(result);

	}

}
