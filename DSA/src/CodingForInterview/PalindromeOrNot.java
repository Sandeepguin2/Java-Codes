   package CodingForInterview;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//n    r    s
		//12   1    1
		//1    2    12
		 //0  1    121
		int n=121;
		int r=0;
		int s=0;
		int t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		if(t==s) {
			System.out.println("is palindrome");
		}else {
			System.out.println("Not a Palindrome Number");
		}

	}

}
