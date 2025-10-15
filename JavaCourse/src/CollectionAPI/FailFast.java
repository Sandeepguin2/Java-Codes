package CollectionAPI;

import java.util.ArrayList;
import java.util.List;

public class FailFast {
//it will give concurrent modification exception beacuse it will be the fail safe where in java collection there will be the changes during the ieteration and internally it uses a modification count or mod count if it chnages during the iteration it will show concurrentmodification exception in the compiler 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		for(int n : nums) {
			nums.add(5);
		}
		System.out.println(nums);

	}

}
