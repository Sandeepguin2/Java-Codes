package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,5,8,9,2);
		Set<Integer> numValues=nums.stream()
				.collect(Collectors.toSet());
		System.out.println(numValues);
		
		
	}

}
