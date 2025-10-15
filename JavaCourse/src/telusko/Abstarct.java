package telusko;

abstract class superbike {
	public abstract void drive();

	public void playMusic() {
		System.out.println("playing Music");
	}

	public void oldbke() {
		System.out.println("Luna");
	}
}

class BMW extends superbike {
	public void drive() {
		System.out.println("driving");
	}
}

public class Abstarct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superbike obj = new BMW();
		obj.drive();
		obj.playMusic();
	

	}

}
