package CollectionAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifaibleList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Collections.unmodifiableList(Arrays.asList("Sandeep","Sanjeeb"));
		System.out.println(names);

	}

}
