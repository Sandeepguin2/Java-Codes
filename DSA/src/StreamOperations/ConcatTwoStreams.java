package StreamOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatTwoStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Stream.concat(Stream.of(2, 8, 7, 9), Stream.of(7, 4, 5, 3)).distinct().sorted()
				.collect(Collectors.toList());
		System.out.println(nums);
	}

}
