package CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sorting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Integer> marks=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				if(num1%10>num2%10) {
					return 1;
				}else {
					return -1;
				}
				
			}
		};
		List<Integer> m= new ArrayList<Integer>();
		m.add(18);
		m.add(33);
		m.add(52);
		m.add(67);
		
		Collections.sort(m,marks);
		System.out.println(m);
		

	}

}
