package ArrayCodingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import CollectionAPI.list2;

public class PrintTheLongestStringFromTheArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Sandeep","mamuni","Lipsa","Raja");
		String longest=names.stream()
				.max(Comparator.comparingInt(String::length))
				.orElse(null);
		System.out.println(longest);

	}

}
