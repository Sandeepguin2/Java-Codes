package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Adress{
	private int id;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Adress(int id, String location) {
		super();
		this.id = id;
		this.location = location;
	}
	public Adress() {
		super();
	}
	@Override
	public String toString() {
		return "Adress [id=" + id + ", location=" + location + "]";
	}
	
	
	
}
public class OnlyExtractTheCityNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Adress> values=Arrays.asList(new Adress(1, "Kendrapara"),new Adress(2, "Cuttack"));
		List<String> val=values.stream()
				.map(Adress::getLocation)
				.collect(Collectors.toList());
		System.out.println(val);
		
		

	}

}
