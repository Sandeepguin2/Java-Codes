package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovesAllZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(1, 0, 30, 0, 7, 0);
		List<Integer> values = Stream.concat(nums.stream().filter(n -> n != 0), nums.stream().filter(n -> n == 0))
				.collect(Collectors.toList());
		System.out.println(values);

	}

}
