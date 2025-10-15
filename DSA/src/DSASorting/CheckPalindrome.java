package DSASorting;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=121;
		int remainder=0;                 
		int s=0;
		int t=number;
		while(number>0) {
			remainder=number%10;
			number=number/10;
			s=s*10+remainder;
		}
		if(t==s) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome number");
		}

	}

}
