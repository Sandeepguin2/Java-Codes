package CodingForInterview;

public class FibonacciWithRecurssionTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int result=fib(n);
		System.out.println(result);

	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n<=1) {
			return n;
		}else {
			return fib(n-1)+fib(n-2);  
			
		}
		
	}

}
