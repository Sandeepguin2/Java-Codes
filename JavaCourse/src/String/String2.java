package String;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Lipsa";
		String s2=new String("Lipsa");
		
		if(s1.equals(s2)) {
			System.out.println("Both the memory location contains same value but memory locations are not same");
			
		}else {
			System.out.println("Doesn't have same value");
		}

	}

}
