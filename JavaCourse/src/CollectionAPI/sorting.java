package CollectionAPI;  

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
    
public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<Integer> com=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				if(num1%10>num2%10)
				return 1;
				else
					return -1;
			}
		};
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(94);
		marks.add(32);
		marks.add(66);
		marks.add(18);
		
		Collections.sort(marks,com);
		System.out.println(marks);

	}

}
