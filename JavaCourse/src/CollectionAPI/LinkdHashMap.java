package CollectionAPI;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkdHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> girls = new LinkedHashMap<String, Integer>();
		girls.put("Sasmita",14);
		girls.put("Rani",56);
		girls.put("Sangita",66);
		System.out.println(girls);
		for (String str : girls.keySet()) {
			System.out.println(str+":"+girls.get(str));
			
		}

	}

}
