package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employees {
    private int id;
    private String name;
    private int locationId;

    public Employees(int id, String name, int locationId) {
        this.id = id;
        this.name = name;
        this.locationId = locationId;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getLocationId() { return locationId; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

class Location {
    private int id;
    private String city;

    public Location(int id, String city) {
        this.id = id;
        this.city = city;
    }

    public int getId() { return id; }
    public String getCity() { return city; }
}


public class GetTheEmployeesWhoAreLocatedInBhubaneswar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Locations
        List<Location> locations = Arrays.asList(
            new Location(1, "Bhubaneswar"),
            new Location(2, "Delhi"),
            new Location(3, "Mumbai")
        );

        // Employees
        List<Employees> employees = Arrays.asList(
            new Employees(101, "Sandeep", 1),
            new Employees(102, "Amit", 2),
            new Employees(103, "Priya", 1),
            new Employees(104, "Ravi", 3)
        );
        // ✅ Using map — build a locationId → city map
        Map<Integer, String> locationMap = locations.stream()
                .collect(Collectors.toMap(Location::getId, Location::getCity));

        // ✅ Now filter employees whose mapped city = "Bhubaneswar"
        List<Employees> employeesInBhubaneswar = employees.stream()
                .filter(emp -> "Bhubaneswar".equalsIgnoreCase(locationMap.get(emp.getLocationId())))
                .collect(Collectors.toList());

        // ✅ Print the result
        employeesInBhubaneswar.forEach(System.out::println);
    }

	}


