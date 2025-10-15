package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//The Reducing method in java streams is used to perform a reduction on the element of the stream using an assosiative accumulation function.
public class Reducing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question:Find the sum of a list of integers
		//Note:When the array is empty it will show 0.
		List<Integer> nums=Arrays.asList(1,2,5,7,4);
		int sum=nums.stream()
				.collect(Collectors.reducing(0,Integer::sum));
		System.out.println(sum);

	}

}
