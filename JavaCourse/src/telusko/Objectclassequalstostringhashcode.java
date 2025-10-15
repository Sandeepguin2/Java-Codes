package telusko;
//Every class in java extends object class
class bike{
	 int price;
	 String name;
	 public String toString() {
		 return "hey";
	 }
}
public class Objectclassequalstostringhashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike obj=new bike();
		obj.name="SANDEEP";
		obj.price=888;
		System.out.println(obj.toString());
		System.out.println(obj);
		
	

	}

}
