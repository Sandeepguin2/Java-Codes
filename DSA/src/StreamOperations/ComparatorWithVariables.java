package StreamOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	private String name;
	private int id;
	private String branch;
	public Student(String name, int id, String branch) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
	}
	public Student() {
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
		return "Student [name=" + name + ", id=" + id + ", branch=" + branch + "]";
	}
	
}
public class ComparatorWithVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Student> students = Arrays.asList(
	                new Student("Sandeep", 3, "CSE"),
	                new Student("Amit", 2, "ECE"),
	                new Student("Sandeep", 1, "IT"),
	                new Student("Amit", 2, "CSE")
	        );
		  Comparator<Student> con=Comparator.comparing(Student::getName)
				  .thenComparing(Student::getId)
				  .thenComparing(Student::getBranch);
		  
		  Collections.sort(students,con);
		  students.forEach(n->System.out.println(n.getName()+n.getId()+n.getBranch()));
		  

	}

}
