package CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifaibleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		List<Integer> l=Collections.unmodifiableList(nums);
		System.out.println(l);
		

	}

}
