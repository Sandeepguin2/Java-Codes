package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(5,6,8,9,2,4);
		List<Integer> numValues=nums.stream()
				.filter(n->n<9)
				.map(n->n*5)
				.collect(Collectors.toList());
		System.out.println(numValues);

	}

}
