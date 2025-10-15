package CollectionAPI;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
//it will doesnt show the concurrent modification exception because it will work on a copy of a list.so changes to the original collection doest affect.More memory usage due to copy 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("A");
		list.add("B");

		for (String s : list) {
		    list.add("C"); // No exception
		}
		System.out.println(list);

	}

}
