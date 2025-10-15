  package StreamOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(1,5,8,9,7,4,5);
		Optional<Integer> min=nums.stream()
				.min(Comparator.comparingInt(Integer::intValue));
		System.out.println(min);

	}

}
