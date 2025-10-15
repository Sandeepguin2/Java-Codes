package telusko;
@FunctionalInterface
interface Cyclone {
	void crash(int i);

}

public class FunctioanalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cyclone obj = i -> System.out.println("in Bhitarkanika" + i);
		obj.crash(5);

	}

}
