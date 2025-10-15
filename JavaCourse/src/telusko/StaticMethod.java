package telusko;
class Mobile1{
	String brand;
	int price;
	static String name;
	
	public void show() {
		System.out.println(brand + ":" + price + ":" + name);
		
	}
	public static void show1(Mobile1 obj) {
		System.out.println(obj.brand + ":" + obj.price + ":" + name);
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile1 obj1 = new Mobile1();
		obj1.brand = "Apple";
		obj1.price = 599;
		
		Mobile1 obj2 = new Mobile1();
		obj2.brand = "Samsung";
		obj2.price = 399;
		
		Mobile1 obj3 = new Mobile1();
		obj3.brand = "Vivo";
		obj3.price = 299;
		
		Mobile.name="Phone";
		
		obj1.show();
		obj2.show(); 
		obj3.show();
		
		Mobile1.show1(obj1);
		Mobile1.show1(obj2);
		
	}

}
