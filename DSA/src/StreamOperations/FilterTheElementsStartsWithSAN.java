package StreamOperations;

import java.util.stream.Stream;

public class FilterTheElementsStartsWithSAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of("Sandeep", "Sanjeeb", "Amit", "Rahul")
		.filter(str -> str.startsWith("San")).forEach(System.out::println);

	}

}
