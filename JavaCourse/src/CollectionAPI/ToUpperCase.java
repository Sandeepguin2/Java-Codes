package CollectionAPI;

import java.util.Arrays;
import java.util.List;

public class ToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("sandeep","navin","lipsa");
		List<String> Unames=names.stream()
				.map(n->n.toUpperCase())
				.toList();
		System.out.println(Unames);

	}

}
