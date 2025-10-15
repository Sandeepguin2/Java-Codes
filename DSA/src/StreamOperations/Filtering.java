package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//The filtering method is used to filter elements of a stream and then collect the result using another collector,
public class Filtering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Questions:Filter and collect only the even numbers from a list of integers.
		List<Integer> nums=Arrays.asList(1,2,6,4,8,7,23,89,5);
		List<Integer> result=nums.stream()
				.collect(Collectors.filtering(n->n%2==0,Collectors.toList()));
		System.out.println(result);

	}

}
