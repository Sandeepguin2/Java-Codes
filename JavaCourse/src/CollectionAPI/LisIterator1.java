package CollectionAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LisIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		ListIterator<Integer> values=nums.listIterator();
		System.out.println("BackWard Operation");
		while(values.hasPrevious()) {
			System.out.println(values.previous());
		}
		

	}

}
