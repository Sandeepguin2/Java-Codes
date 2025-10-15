package StreamOperations;

import java.util.Arrays;
import java.util.List;

//If no elements in the stream match a given predicate  
public class noneMatch {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,2,3,4,5);
		boolean result=nums.stream()
				.noneMatch(n->n<0);
		System.out.println(result);
		
	}

}
