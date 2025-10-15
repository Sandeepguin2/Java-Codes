package telusko;

//StaticVariable is shared by all the objects
class Mobile {
	String brand;
	int price;
	static String name;
	public void show() {
		System.out.println(brand + ":" + price + ":" + name);
	}
}

public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 599;
		
		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 399;
		
		Mobile obj3 = new Mobile();
		obj3.brand = "Vivo";
		obj3.price = 299;
		
		Mobile.name="Phone";
		
		obj1.show();
		obj2.show();
		obj3.show();

	}

}
