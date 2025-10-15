package CollectionAPI;

import java.util.HashSet;

import java.util.Iterator;
import java.util.Set;

public class Itretor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> students=new HashSet<String>();
		students.add("Sandeep");
		students.add("Sangram");
		students.add("Rinku");
		students.add("Mamuni");
		Iterator<String> values=students.iterator();
		while(values.hasNext())
		System.out.println(values.next());

	}

}
