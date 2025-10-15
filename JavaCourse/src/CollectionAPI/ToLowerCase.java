package CollectionAPI;

import java.util.Arrays;
import java.util.List;

public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> bikes=Arrays.asList("kawasaki","hero","yamaha");
		List<String> bike=bikes.stream()
				.map(n->n.toLowerCase())
				.toList();
		System.out.println(bike);

	}

}
