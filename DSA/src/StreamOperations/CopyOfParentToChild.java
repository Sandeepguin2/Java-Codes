package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StudentRegister{
	private String name;
	private int id;
	private String branch;
	public StudentRegister(String name, int id, String branch) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
	}
	public StudentRegister() {
		super();
	}
	@Override
	public String toString() {
		return "StudentRegister [name=" + name + ", id=" + id + ", branch=" + branch + "]";
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
	
	
}
class StudentSubRegister extends StudentRegister{
	//creating constructor of StudentSubRegister
	public StudentSubRegister(StudentRegister s) {
		super(s.getName(),s.getId(),null);
	}
}
public class CopyOfParentToChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentRegister> values=Arrays.asList(new StudentRegister("Sandeep", 29, "Mechanical"),new StudentRegister("Sanjeeb", 12, "Medical"));
		List<StudentSubRegister> subValues=values.stream()
				.map(StudentSubRegister::new)
				.collect(Collectors.toList());
		subValues.forEach(c -> 
	    System.out.println(c.getName() + " " + c.getId() + " " + c.getBranch()));
		//This will copy only name and id, leaving branch = null
		
				

	}

}
