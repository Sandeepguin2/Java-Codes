package CollectionAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(2, 5, 9, 3, 6);
		Stream<Integer> sortedValues=nums.stream()
				.filter(n->n%2==0)
				.sorted();
		sortedValues.forEach(n->System.out.println(n));
		 

	}

}
