package telusko;

class Human {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String b) {
		name = b;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj = new Human();
		obj.setAge(30);
		obj.setName("SANDEEP");
		System.out.println(obj.getAge() + ":" + obj.getName());

	}

}
