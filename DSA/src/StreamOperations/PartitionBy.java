package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//The partitionBy method in java used to partition the elements of a stream into two groups based on a specified predictae.It returns a map where the keys are boolean and the values are lists of a elements that satisfy (or don't satisfy) the predicate .
public class PartitionBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question:Partition a list of integers into even and odd numbers
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8);
		Map<Boolean, List<Integer>> result=numbers.stream()
				.collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println(result);

	}

}
