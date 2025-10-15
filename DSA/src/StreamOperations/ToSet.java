package StreamOperations;
//Duplicates values will be removed in the set interface.
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(4,5,5,5);
		Set<Integer> values=nums.stream()
				.collect(Collectors.toSet());
		System.out.println(values);

	}

}
