package telusko;

abstract class Homee {
	public abstract void live();
}

public class AnnonymousInnerClassAndAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homee obj = new Homee() {

			@Override
			public void live() {
				// TODO Auto-generated method stub
				System.out.println("Stay happy");

			}
		};
		obj.live();

	}

}
