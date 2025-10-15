package CollectionAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class OriginOfForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
		Consumer<Integer> con=new Consumer<Integer>() {
			
			@Override
			public void accept(Integer n) {
				// TODO Auto-generated method stub
				System.out.println(n);
				
			}
		};
		nums.forEach(con);

	}

}
