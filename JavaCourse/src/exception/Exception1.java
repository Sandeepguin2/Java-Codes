 package exception;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		try
		{
		j=18/i;
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		
		System.out.println("Bye");

	}

}
