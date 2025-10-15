 package CollectionAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//Method Description
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(2,8,6,5,3,7,9,2,4);
		Consumer<Integer> con=new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
				
			}
		};
		nums.forEach(con);
	}

}
