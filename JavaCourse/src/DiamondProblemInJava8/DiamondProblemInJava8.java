package DiamondProblemInJava8;
interface A{
	default void show() {
		System.out.println("In A Show");
	}
}
interface B extends A{
	default void show() {
		System.out.println("In B show");
	}
}
interface C extends A{
	default void show() {
		System.out.println("in C show");
	}
}
class D implements B,C{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		C.super.show();
	}
	
}
public class DiamondProblemInJava8 {
	public static void main(String[] args) {
		A a=new D();
		a.show();
	}

}
