package PassByValue;
//here in this example we have refer the variable to the reference object of class Dog //
//and the object is belongs to the class Dog.So that by the reference it will provide the new value inside the method
class Dog {
	String name;
}

public class PassByReference {
	public static void main(String[] args) {
		Dog mydog = new Dog();
		mydog.name = "Buddy";
		changeTheName(mydog);
		System.out.println(mydog.name);
	}

	private static void changeTheName(Dog n) {
		// TODO Auto-generated method stub
		n.name="Max";
		
	}

}
