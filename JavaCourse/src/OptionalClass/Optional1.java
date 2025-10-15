package OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> namaes=Arrays.asList("Sandeep","john","Kishore");
		Optional<String> name=namaes.stream()
				.filter(str->str.contains("K"))
				.findFirst();
		System.out.println(name.get());

		

	}

}
