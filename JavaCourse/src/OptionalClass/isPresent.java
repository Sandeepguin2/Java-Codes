package OptionalClass;
//Return type: boolean
//Purpose: Checks whether a value is present in the Optional.
//Usage: Typically used with an if condition.
import java.util.Optional;
//if there is no value present in the optional object then it will give null pointer exception
public class isPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> name=Optional.of("Sandep");
		if(name.isPresent()) {
			System.out.println(name.get());
		}
		

	}

}
