package CollectionAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
class Student{
	private String name;
	private int age;
	public Student() {
		
	}
	public Student(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	
}
public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Sandeep","Sanjeeb","Mohan","Radhika");
		List<Student> students=new ArrayList<Student>();
		
		students=names.stream()
				//.map(name->new Student(name))
				.map(Student::new)
				.toList();
		System.out.println(students);
				
		
		
		

	}

}
