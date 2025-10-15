package CollectionAPI;

import java.util.HashMap;
import java.util.Map;

public class QuestionOfMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> values=new HashMap<>();
		values.put("BMW",1000);
		values.put("BMW", 310);
		System.out.println(values);
		//HashMap stores key–value pairs.

//Keys must be unique. If you put a value for an existing key, it replaces the old value.

//So first "BMW" → 1000 is added.

//Then you overwrite it with "BMW" → 310.

//When printing, only the last value remains.
		
		

	}

}
