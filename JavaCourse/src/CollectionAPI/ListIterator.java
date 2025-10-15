package CollectionAPI;

import java.util.Arrays;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(1,4,7,8,5,2);
		java.util.ListIterator<Integer> values=nums.listIterator();
//		while(values.hasNext()) {
//			System.out.println(values.next());
//		}
		while(values.hasPrevious()) {
			System.out.println(values.previous());
		}

	}

}
