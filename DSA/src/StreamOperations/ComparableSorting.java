package StreamOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//when you want a natural/default sorting and you override compareTo() method in your class
class School implements Comparable<School>{
	private String name;
	private int id;
	private String branch;
	public School(String name, int id, String branch) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
	}
	public School() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", id=" + id + ", branch=" + branch + "]";
	}
	public int compareTo(School that) {
        // Natural order by id
        return Integer.compare(this.id, that.id);
    }
	
}
public class ComparableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<School> students = Arrays.asList(
	                new School("Sandeep", 3,"Mechanical"),
	                new School("Amit", 1,"Electrical"),
	                new School("Neha", 2,"Civil")
	        );
		 Collections.sort(students);
		 students.forEach(n->System.out.println(n));

	}

}
