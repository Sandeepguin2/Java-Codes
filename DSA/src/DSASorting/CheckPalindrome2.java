package DSASorting;

public class CheckPalindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12344321;
		int remainder=0;
		int process=0;
		int t=num;
		while(num>0) {
			remainder=num%10;
			num=num/10;
			process=process*10+remainder;
		}
		if(t==num) {
			System.out.println("It is a palindrome number ");
		}else {
			System.out.println("it is not a palindrome number");
		}

	}

}
