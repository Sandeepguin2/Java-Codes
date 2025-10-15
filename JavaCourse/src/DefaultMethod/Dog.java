package DefaultMethod;

public class Dog implements Animal {

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("It is a dogs");
		Animal.super.shhh();

	}
	public static void main(String[] args) {
		Animal a=new Dog();
		a.bark();
		//a.shhh();
	}

}
