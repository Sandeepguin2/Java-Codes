package CollectionAPI;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students>{
	int id;
	String name;
	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}
	public int compareTo(Students that) {
		return this.name.compareTo(that.name);
	}
	
}
public class Comparableee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Students> values=new ArrayList<>();
		values.add(new Students(1, "Sandeep"));
		values.add(new Students(2, "Aditi"));
		values.add(new Students(3, "Bhabani"));
		
		Collections.sort(values);
		for(Students s:values) {
			System.out.println(s.id+":"+s.name);
		}
		
		

	}

}
