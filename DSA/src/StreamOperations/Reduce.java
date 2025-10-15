package StreamOperations;
//Question:Compute the product of all numbers in a list.
import java.util.Arrays;
import java.util.List;

public class Reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(2,5,8,9,7);
		int result=nums.stream()
				.filter(n->n%2==0)
				.map(n1->n1*2)
				.reduce(0,(c,e)->c+e);
		System.out.println(result);

	}

}
