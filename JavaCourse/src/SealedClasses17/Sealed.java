package SealedClasses17;
//final,Sealed,NonSealed
sealed class A extends Thread implements Cloneable permits B,C{
	
}
non-sealed class B extends A{
	
}
final class C extends A{
	
}
class D extends B{
	
}


public class Sealed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
