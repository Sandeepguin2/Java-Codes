package CollectionAPI;

import java.util.HashMap;
import java.util.Map;

//Key and value pair
public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> values=new HashMap<String, Integer>();
		values.put("Sandeep", 55);
		values.put("Lipsa", 87);
		values.put("Navin", 56);
		values.put("Sandeep", 91);
		
		System.out.println(values);
		System.out.println(values.get("Sandeep"));
		System.out.println(values.keySet());
		for(String name:values.keySet()) {
			System.out.println(name+":"+values.get(name) );
		}
		
		
		

	}

}
