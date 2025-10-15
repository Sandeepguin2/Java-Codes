package StreamOperations;
//Retrive the distnict values
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Questions:remove duplicates from a list of integers 
public class distnict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(1,1,2,2,3,3,3);
		List<Integer> result=nums.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(result);

	}

}
