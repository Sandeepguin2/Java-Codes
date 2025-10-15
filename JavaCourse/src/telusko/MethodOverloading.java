package telusko;

//In Java, Method Overloading allows different
//methods to have the same name, but different signatures
//where the signature can differ by the number of input parameters or type of input parameters, 
//or a mixture of both.
class Calculator {
	public int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	public int add(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		int res = calc.add(2, 5, 1);
		System.out.println(res);
	}

}
