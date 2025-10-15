package StreamOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class EmployeeCircle {
	private String name;
	private String department;
	private double salary;

	public EmployeeCircle(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name + " (" + department + ", " + salary + ")";
	}
}

public class GetMaximumSalaryBasedUponThedepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeCircle> emp = Arrays.asList(new EmployeeCircle("Alice", "A", 50000),
				new EmployeeCircle("Bob", "A", 60000), new EmployeeCircle("Charlie", "B", 55000),
				new EmployeeCircle("David", "B", 70000), new EmployeeCircle("Eve", "C", 80000),
				new EmployeeCircle("Frank", "C", 75000));
		Map<String, EmployeeCircle> values = emp.stream()
				.collect(Collectors.groupingBy(EmployeeCircle::getDepartment, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparingDouble(EmployeeCircle::getSalary)), Optional::get)));
		System.out.println(values);
	}

}
