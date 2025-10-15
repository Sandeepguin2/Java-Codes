package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//questions:Fetch the first 3 elements from a list of integers
public class Limit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 5, 8, 7, 9, 5, 4, 6, 3, 8, 9, 5, 7);
		List<Integer> limitedValues = numbers.stream().limit(5).collect(Collectors.toList());
		System.out.println(limitedValues);

	}

}
