package CollectionAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultipleValuesInSameKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<Integer>> values=new HashMap<String, List<Integer>>();
		values.computeIfAbsent("BMW", k -> new ArrayList<>()).add(1000);
		values.computeIfAbsent("BMW", k -> new ArrayList<>()).add(310);
		values.computeIfAbsent("BMW", k -> new ArrayList<>()).add(null);
		System.out.println(values);

	}

}
