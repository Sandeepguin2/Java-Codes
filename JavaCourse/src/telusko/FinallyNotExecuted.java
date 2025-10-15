package telusko;
//In this case finally not executed because when we write system.exit() inside try block then only the try block will executed instead of finally block
public class FinallyNotExecuted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("I am a boy");
			System.exit(0);
		}finally {
			System.out.println("it will not executed");
		}

	}

}
