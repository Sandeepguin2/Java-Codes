package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsBetweenTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array1= {1,2,3,4,5,6};
		Integer[] array2= {1,2,3,7,8,9};
		
		Set<Integer> setValues=Arrays.stream(array1).collect(Collectors.toSet());
		
		List<Integer> values=Arrays.stream(array2)
				.filter(setValues::contains)
				.collect(Collectors.toList());
		System.out.println(values);
	}

}
