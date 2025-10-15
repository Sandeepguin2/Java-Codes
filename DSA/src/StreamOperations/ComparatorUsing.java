package StreamOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<Integer> con=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer n1, Integer n2) {
				// TODO Auto-generated method stub
				if(n1%10>n2%10) {
					return 1;
				}else {
					return -1;
				}
				
			}
		};
		List<Integer> nums=Arrays.asList(44,61,82);
		Collections.sort(nums,con);
		System.out.println(nums);

	}

}
