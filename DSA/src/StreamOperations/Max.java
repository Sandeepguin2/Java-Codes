package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//max:It is used to find the maximum and minimum elements in a stream respectively based on a given comparator or natural ordering . These methods return an optional because the stream might bee empty.
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//There will be use of comparator which is used to compare the elements among themselves the give the max or min output
		List<Integer> nums=Arrays.asList(5,1,8,3,9);
		Optional<Integer> max=nums.stream()
				.max(Integer::compareTo);
		System.out.println(max);
		

	}

}
