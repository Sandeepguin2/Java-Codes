package CollectionAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterOrigin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(2, 6, 8, 7, 9);
		Predicate<Integer> p = new Predicate<Integer>() {

			@Override
			public boolean test(Integer n) {
				// TODO Auto-generated method stub
				if (n % 2 == 0)
					return true;
				else
					return false;
			}
		};
		int result = nums.stream()
				.filter(p).map(n -> n * 2)
				  .reduce(0, (c, e) -> (c + e));

		System.out.println(result);

	}

}
