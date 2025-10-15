package StreamOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<String> con=new Comparator<String>() {
			
			@Override
			public int compare(String str1, String str2) {
				// TODO Auto-generated method stub
				if(str1.length()>str2.length()) {
					return 1;
				}
				return -1;
			}
		};
		List<String> values=Arrays.asList("Sandeep","Aman","Rahul");
		Collections.sort(values,con);
		System.out.println(values);

	}

}
