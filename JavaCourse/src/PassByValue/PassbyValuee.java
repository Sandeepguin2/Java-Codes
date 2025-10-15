package PassByValue;

//Notes:- Java by-default is pass by value and in this pass by value 
//when we are assigning a value to a variable 
//then we have to change the value then it will make a copy of the original value and then pass inside
//the variable so that it will not affect the original value irrespective of the new method parameter
class Student {
	String name;
}

public class PassbyValuee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		String name = "Raja";
		changeName(name);
		System.out.println(name);

	}

	private static void changeName(String name2) {
		// TODO Auto-generated method stub
		name2 = "Rinku";

	}

}
