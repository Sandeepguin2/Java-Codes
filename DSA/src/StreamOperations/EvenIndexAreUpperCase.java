package StreamOperations;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenIndexAreUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sandeep";
		String name=IntStream.range(0, str.length())
				.mapToObj(n->(n%2==0)
				? String.valueOf(Character.toUpperCase(str.charAt(n)))
				: String.valueOf(str.charAt(n)))
				.collect(Collectors.joining());
		System.out.println(name);
			

	}

}
