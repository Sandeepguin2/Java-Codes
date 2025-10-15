package StreamOperations;

import java.util.Arrays;
import java.util.List;

//AnyMatch:The anymatch method checks whether at least one element in the stream matches a given predicte .It returns true as soon as it finds an element that satisfy the predicate and stops further processing .If no element matches, it returns false.
//Anymatch is shortcircuting , meaning it stops processing as soon as it finds the first element that matches the predicate ,optimizing performance.
public class AnyMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(5,8,12,3);
		boolean result=nums.stream()
				.anyMatch(n->n>10);
		System.out.println(result);

	}

}
