package exception;
class SandeepException extends Exception{

	public SandeepException(String str) {
		super(str);
	}
	
}
public class ThrowKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;
		int j = 0;

		try {
			j = 18 / i;
			if(j==0)
				throw new SandeepException("I dont want to print zero");

		} catch (SandeepException e) {
			j=18/1;
			System.out.println("Thts the default output"+e);
		} catch (Exception e) {
			System.out.println("Something went wrong" + e);
		}
		System.out.println(j);

	}

}
