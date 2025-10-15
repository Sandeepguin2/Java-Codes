package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Questions:Skip the first 4 elements and fetch the remaiming elements from a list of integers
public class Skip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(1,5,8,7,4,56,2,4,7);
		List<Integer> res=nums.stream()
				.skip(5)
				.collect(Collectors.toList());
		System.out.println(res);

	}

}
