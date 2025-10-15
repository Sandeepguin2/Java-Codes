package StreamOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Bike implements Comparable<Bike>{
	private String name;
	private int cc;
	private String tyre;
	public Bike(String name, int cc, String tyre) {
		super();
		this.name = name;
		this.cc = cc;
		this.tyre = tyre;
	}
	public Bike() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getTyre() {
		return tyre;
	}
	public void setTyre(String tyre) {
		this.tyre = tyre;
	}
	@Override
	public String toString() {
		return "Bike [name=" + name + ", cc=" + cc + ", tyre=" + tyre + "]";
	}
	@Override
	public int compareTo(Bike that) {
		// TODO Auto-generated method stub
		return this.name.compareTo(that.name);
	}
	
}
public class DefaultSortingComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bike> values=Arrays.asList(new Bike("Kawasaki", 999, "ceat"),
				new Bike("BMW", 999, "pirelii"),
				new Bike("TVS", 310, "MRF"));
		Collections.sort(values);
		values.forEach(System.out::println);
		

	}

}
