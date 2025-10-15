package Record;
//Used for data-carrier classes (like DTOs) without boilerplate
//Auto-generates constructor, getters, equals(), hashCode(), toString()
public class Recordd {
	public record Employee(String name, int id) {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee("Sandeep", 101);
		System.out.println(e.name() +":"+ e.id());

	}

}
