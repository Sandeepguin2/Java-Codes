package OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String> stud=Arrays.asList("Sandeep","Sanjeeb","Rinku");
	Optional<List<String>> opt=Optional.of(stud);
	System.out.println(opt);
	

	}

}
