package StreamOperations;
//Peek:The peek method in java streams is primarily used for debugging purposes.it allows you to perform an intermediate operation on each elememnt of the stream without modifying the stream itself.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class peek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words=Arrays.asList("apple","banana","cherry");
		List<String> result=words.stream()
				.peek(word->System.out.println("Original:"+word))
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(result);

	}

}
