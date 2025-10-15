package CodingForInterview;
//Question:
//find the nth element in fibonacci series using recursion
//input:=9
//output:34
public class NthElementInFibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println(fib(n));
		

	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n<=1) {
			return n;
		}else 
			return fib(n-1)+fib(n-2);
	}
	
	
}
