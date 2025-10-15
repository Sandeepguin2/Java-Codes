package StreamOperations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//Question:Given a list of strings,flatten them into single list of strings.
public class FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> orders=Arrays.asList(Arrays.asList("1st order","2nd order"),Arrays.asList("dress","pants"));
		List<String> result=orders.stream()
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
		System.out.println(result);
                                                                         
	}

}
