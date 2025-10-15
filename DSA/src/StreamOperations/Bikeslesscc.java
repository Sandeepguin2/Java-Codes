package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Bikes {
    private String name;
    private int cc;

    public Bikes(String name, int cc) {
        this.name = name;
        this.cc = cc;
    }

    public String getName() { return name; }
    public int getCc() { return cc; }

    @Override
    public String toString() {
        return "Bike{name='" + name + "', cc=" + cc + "}";
    }
}
public class Bikeslesscc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bikes> bikes = Arrays.asList(
	            new Bikes("Hero Splendor", 100),
	            new Bikes("Bajaj Pulsar", 150),
	            new Bikes("Yamaha R15", 150),
	            new Bikes("Royal Enfield", 350),
	            new Bikes("KTM Duke", 390)
	        );
		List<Bikes> values=bikes.stream()
				.filter(n->n.getCc()<350)
				.collect(Collectors.toUnmodifiableList());
		values.forEach(System.out::println);

	}

}
