package telusko;
class Sandeep{
	public void show() {
		System.out.println("Big boy");
	}
	class Sanjeeb{
		public void show1() {
			System.out.println("Small boy");
		}
	}
}
public class InnerClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sandeep obj=new Sandeep();
		obj.show();
		
		Sandeep.Sanjeeb obj2=obj.new Sanjeeb();
		obj2.show1();
				
	
		

	}

}   
