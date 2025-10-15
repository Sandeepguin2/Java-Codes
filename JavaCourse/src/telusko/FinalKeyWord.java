package telusko;

//final-variable,method,class
//Class as final:-when you are mention a class as final then it will stop the inheritance 
class Car {
	public void show() {
		System.out.println("in cars show");
	}

	public void config() {
		System.out.println("in car config");
	}
}

class supercar extends Car {
	public void show() {
		System.out.println("in supercar show");
	}

}

public class FinalKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		supercar obj = new  supercar();
		obj.show();
		
		
		
		
//		final int num=8;//vairable as final
//		//num=9;
//		System.out.println(num);

	}

}
