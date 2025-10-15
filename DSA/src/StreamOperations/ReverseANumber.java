package StreamOperations;

import java.util.stream.Collectors;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int reversed = Integer.parseInt(new StringBuilder(
				String.valueOf(num).chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining()))
				.reverse().toString());
		System.out.println(reversed);

	}

}
