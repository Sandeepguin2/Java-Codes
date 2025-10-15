package exception;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=9;
		int j=4;
		int k=0;
		try
		{
		int result=j-i/0;
		}
		catch(Exception e) {
			System.out.println("in negative value");
		}
		System.out.println("Bye");

	}

}
