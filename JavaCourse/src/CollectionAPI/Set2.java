package CollectionAPI;

import java.util.Set;
import java.util.TreeSet;

//When we want sorted value
public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> marks = new TreeSet<Integer>();
		marks.add(21);
		marks.add(66);
		marks.add(28);
		marks.add(96);
		for (int n : marks) {
			System.out.println(n);

		}

	}

}
