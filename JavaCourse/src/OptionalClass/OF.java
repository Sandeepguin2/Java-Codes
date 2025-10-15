package OptionalClass;

import java.util.Optional;

public class OF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> name = Optional.of("Sandeep");
		System.out.println(name);

		// -----------------------------------------------------

		Optional<String> str = Optional.of(null);
		System.out.println(str); // It will throw Null Pointer Exception

	}

}
