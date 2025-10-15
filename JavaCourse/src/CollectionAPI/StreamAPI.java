  package CollectionAPI;
// The uses of Stream in Java are mentioned below:
//	 Stream API is a way to express and process collections of objects.
//	 Enable us to perform operations like filtering, mapping, reducing, and sorting.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(2, 5, 6, 3, 9, 8, 5);
		int result=nums.stream()
				.filter(n->n%2==0)
				.map(n->n*2)
				.reduce(0,(c,e)->c+e);
		System.out.println(result);
		


	}

}
