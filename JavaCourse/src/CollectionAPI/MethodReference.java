package CollectionAPI;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> boys=Arrays.asList("sangram","sandeep","subodh");
		List<String> boy=boys.stream()
				.map(String::toUpperCase)   //Method Reference
				.toList();
		//System.out.println(boy);
		boy.forEach(System.out::println);

	}

}
