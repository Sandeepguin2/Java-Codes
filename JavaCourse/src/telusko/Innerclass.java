package telusko;
class Television{
	int price;
	public void show() {
		
	}
	class Ledtv{
		public void show1() {
			System.out.println("in show led");
		}
	}
}
public class Innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television obj = new  Television();
		obj.show();
		//led tv is belongs to television and for creating the obj of ledtv we need the object of television class
		Television.Ledtv obj1=obj.new Ledtv();
		obj1.show1();
		
		
		
		

	}

}
