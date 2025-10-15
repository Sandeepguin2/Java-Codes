package ArrayCodingQuestions;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "Hello World";
	        String reversed = "";
	        
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed += input.charAt(i);
	        }

	        System.out.println("Reversed String: " + reversed);
	}

}
