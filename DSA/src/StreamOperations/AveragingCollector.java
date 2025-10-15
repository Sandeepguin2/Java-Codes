package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
    
}

public class AveragingCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
	            new Employee("A", 5000),
	            new Employee("B", 7000),
	            new Employee("C", 6000)
	        );
		double avg=employees.stream()
				.collect(Collectors.averagingInt(Employee::getSalary));
		System.out.println(avg);
		

	}

}
