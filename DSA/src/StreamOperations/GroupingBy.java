package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

//It is used group of the stream by a specified classifier function.It is  powerful feature provided by the collectors utility class and is commonly used for aggregating and categorizing data into a map where the keys are the result of applying the classifier function and the values are lists of items corresponding to each key.
class Person{
	 String name;
	 String city;
	@Override
	public int hashCode() {
		return Objects.hash(city, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(city, other.city) && Objects.equals(name, other.name);
	}
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

public class GroupingBy {

	@Override
	public String toString() {
		return "GroupingBy [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people=Arrays.asList(
				new Person("John", "New York"),
				new Person("Jane", "London"),
				new Person("Jack", "New York"));
		Map<String, List<Person>> result=people.stream()
				.collect(Collectors.groupingBy(Person::getCity));
		System.out.println(result);

	}

	

}
