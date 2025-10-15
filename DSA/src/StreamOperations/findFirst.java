package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Find first is used to retrieve the first element in a stream that matches a given condition or simply the first element on the stream if no filtering is applied.it returns the first element wrapped in an optional,which is a container object that may or maynot contain a non-null value.
//Find first is a short circuiting operation meaning it stops processing as soon as it finds the first element,optimizing performance.
public class findFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words=Arrays.asList("Sandeep","Lipsa","Mango","Apple");
		Optional<String> result=words.stream()
				.filter(word->word.startsWith("L"))
				.findFirst();
		System.out.println(result);
		

	}

}
