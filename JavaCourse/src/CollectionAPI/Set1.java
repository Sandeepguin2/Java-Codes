package CollectionAPI;

import java.util.HashSet;
import java.util.Set;
//
public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> marks=new HashSet<Integer>();
		marks.add(11);
		marks.add(65);
		marks.add(11);
		marks.add(96);
		for(int n:marks) {
			System.out.println(n);
		}

	}

}
