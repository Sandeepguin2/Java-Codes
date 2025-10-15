package StreamOperations;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbersInAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(10,20,30);
		double avg=nums.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0);
		System.out.println(avg);

	}

}
