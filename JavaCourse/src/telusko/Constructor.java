package telusko;
//constructor is used to initialize the object.Whenever a object of class is created it will call the constructor
//It has same name as class name and there is no return type.
class Humann{
	private int age;
	private String name;
	public Humann() {
		age=12;
		name="Sandeep";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humann obj = new Humann();
		obj.getAge();
		obj.getName();
		System.out.println(obj.getAge()+":"+obj.getName());

	}

}
