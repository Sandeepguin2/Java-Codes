package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseByJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits=Arrays.asList("banana","mango","grapes");
		List<String> capitalLetters=fruits.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(capitalLetters);
				

	}

}
