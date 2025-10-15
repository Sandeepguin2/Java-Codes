package StreamOperations;

import java.util.Arrays;
import java.util.List;

//AllMatch:The AllMatch method in java streams is used to check if all elements in the stream satisfy a given predicate .It returns true if every element in the stream matches the predicate, and  false otherwise.
//Short-circuting operation:The allMatch operation is shortcircuting ,meaning it stops processing as soon as it finds the first element that doesnot match the predictae .if it finds such an element ,it immediately return false.
public class AllMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question:Check if all numbers in a list are positive
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
		//all match will check every element one by one 
		boolean result=nums.stream()
				.allMatch(n->n>0);
		System.out.println(result);

	}

}
