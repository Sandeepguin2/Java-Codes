package exception;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//here if you will add a new object into the unmodifiable list it will give illegalstateexception
public class IllegalstateException {
	public static void main(String[] args) {
		List<String> names=Collections.unmodifiableList(Arrays.asList("Sandeep","Sanjeeb"));
		names.add("Sagar");
		System.out.println(names);

	}

}
