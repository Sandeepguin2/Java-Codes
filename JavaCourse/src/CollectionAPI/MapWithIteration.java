package CollectionAPI;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapWithIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> bikes=new HashMap<String, Integer>();
		bikes.put("BMWS1000 RR", 299);
		bikes.put("Harley 440", 163);
		bikes.put("Hero Xtreme 160", 132);
		Iterator<Map.Entry<String, Integer>> values=bikes.entrySet().iterator();
		while(values.hasNext()) {
			Map.Entry<String, Integer> mapp=values.next();
			System.out.println(mapp);
			
		}

	}

}
