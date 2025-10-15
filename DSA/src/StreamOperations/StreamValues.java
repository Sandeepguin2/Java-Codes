package StreamOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> names = Stream.of("Sandeep", "Sanjeeb", "Amit");
		//Printing the stream of values using for each loop
        //names.forEach(str->System.out.println(str));
		
		
		//printing the values using a new collection 
		List<String> values=names.collect(Collectors.toList());
		System.out.println(values);
	}

}
