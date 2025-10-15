package OptionalClass;

import java.util.Optional;

//Return type: void

//Purpose: Performs the given action if a value is present.

//Usage: Cleaner, functional-style approach using lambdas.
//This is more concise and avoids explicitly calling .get().
public class Ifpresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> name =Optional.of("Sandeep");
		name.ifPresent(n->System.out.println(n));

	}

}
