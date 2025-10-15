package DefaultMethod;

public interface Animal {
	public abstract void bark();
	
	default public  void shhh() {
		System.out.println("It is a snake");
	}

}
