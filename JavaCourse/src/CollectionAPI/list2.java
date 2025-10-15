package CollectionAPI;

import java.util.ArrayList;
import java.util.List;

public class list2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> boys=new ArrayList<String>();
		boys.add("Ram");
		boys.add("Sandeep");
		boys.add("Sanjeev");
		boys.add("Lipsa");
		System.out.println(boys.indexOf("Sandeep"));
		System.out.println(boys.get(0));
		System.out.println(boys.remove(3));
		System.out.println(boys.reversed());

	}

}
