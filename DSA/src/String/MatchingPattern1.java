package String;

public class MatchingPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="SandeepGuin";
		String pattern="uine";
		boolean result=text.contains(pattern);
		
		if(result) {
			System.out.println("Pattern Found");
		}else {
			System.out.println("Not found");
		}

	}

}
