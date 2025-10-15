package telusko;

class Olddesign {
	public void show() {
		System.out.println("good experience");
	}
}

public class AnnoymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Annonymous inner class
		Olddesign obj = new Olddesign() {
			public void show() {
				System.out.println("best experience");
			}
		};
		obj.show();

	}

}
