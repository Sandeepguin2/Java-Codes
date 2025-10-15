package StreamOperations;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

//The summerizingiInt method in java streams is a collector that generates summary statistics for the element of a stream, including count ,sum,mimimum,average,and maximum. 
public class SummerizingInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Questions:Generate summary statistics(count,sum,minimum,average and maximum) for a list of integers.
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		IntSummaryStatistics stats=numbers.stream()
				.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(stats);
	}

}
