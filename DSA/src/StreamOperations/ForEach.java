package StreamOperations;

import java.util.Arrays;
import java.util.List;

//Questions:print each element of a list of strings with a prefix "bike name is :"
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> bikeNames = Arrays.asList("BMW", "NINJA", "DUCATI");
		bikeNames.stream().forEach(bike -> System.out.println("bike name is:" + bike));

	}

}
