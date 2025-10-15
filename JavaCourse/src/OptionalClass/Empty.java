package OptionalClass;

import java.util.Optional;

public class Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> name=Optional.empty();
		String names=name.get();
		System.out.println(names);

	}

}
