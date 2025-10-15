package CollectionAPI;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> bikes=new HashMap<String, Integer>();
		bikes.put("BMWS1000 RR", 299);
		bikes.put("Harley 440", 163);
		bikes.put("Hero Xtreme 160", 132);
		
		//System.out.println(bikes);
		System.out.println(bikes.keySet());
		for (String str : bikes.keySet()) {
			System.out.println(str+":"+bikes.get(str));
			
		}

	}

}
