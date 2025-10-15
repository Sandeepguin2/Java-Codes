package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FindingThevaluesWhichareNonnullorempty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Sandeep","","","Lipsa","Sagar",null,null);
		List<String> values=names.stream()
				.filter(Objects::nonNull)
				.filter(str->!str.isEmpty())
				.collect(Collectors.toList());
	System.out.println(values);

	}

}
