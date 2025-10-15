package telusko;
class Kendrapra{
	public void show1() {
		System.out.println("in KPD show");
	}
}
class kajala extends Kendrapra{
	public void show2() {
		System.out.println("in kajala show");
	}
}
public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kendrapra obj =(Kendrapra) new kajala();
		obj.show1();
		//Upcasting 
		//object of kajala and reference of kendrapra
		
		
		kajala obj1=(kajala)obj;
		obj1.show2();
		//Downcasting

	}

}
