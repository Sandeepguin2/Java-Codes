package ArrayCodingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(1,2,4,5,7,8,9,6);
		int largest=nums.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElse(null);
		System.out.println(largest);
				
	

	}

}
