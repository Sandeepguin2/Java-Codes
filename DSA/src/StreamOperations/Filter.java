package StreamOperations;
//Filter the values basis of some condition
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//filter out the objects from an  array based upon some condition
//Intermediate operation
public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(5,1,2,6,8,10,12);
		List<Integer> numValues=nums.stream()
				.filter(n->n%2==0)
				.collect(Collectors.toList());
		System.out.println(numValues);

	}

}
