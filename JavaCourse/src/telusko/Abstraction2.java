package telusko;
//We cannot create the object of abstract class.
abstract class kitchen{
	public abstract void cooking();
	public abstract void washing();	
	public void chikenmaking() {
		System.out.println("tasty chiken");
	}
}
class Modularkitchen extends kitchen{

	@Override
	public void cooking() {
		// TODO Auto-generated method stub
		System.out.println("best in class");
	}

	@Override
	public void washing() {
		// TODO Auto-generated method stub
		System.out.println("best wasing");
	}
	
}
public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kitchen obj=new Modularkitchen();
		obj.chikenmaking();
		obj.cooking();
		obj.washing();

	}

}
