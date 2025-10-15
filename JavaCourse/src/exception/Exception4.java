package exception;

public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=17/0;
		}
		catch(Exception e) {
			System.out.println("Cannot divide by zero"+e);
		}

	}

}
