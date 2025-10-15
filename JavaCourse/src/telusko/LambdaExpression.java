package telusko;
//Lambda expression only works with the functional interface
@FunctionalInterface
interface GamingLaptop {
	void smooth(String core);

}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamingLaptop obj = (core) -> System.out.println("Hardcore Gaming");
		obj.smooth("intel");

	}

}
