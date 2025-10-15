package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartsWithTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(1, 22, 2, 5, 77, 21);
		List<Integer> values=nums.stream()
				.filter(n->String.valueOf(n).startsWith("2"))
				.collect(Collectors.toList());
		System.out.println(values);

	}

}
