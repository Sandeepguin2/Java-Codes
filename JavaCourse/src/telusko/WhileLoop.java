package telusko;
//While and Do while Loop
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <=5) {
			System.out.println("Hi");
			int j = 1;
			while (j <= 4) {
				System.out.println("Hello");
				j++;
			}
			i++;
		}
		System.out.println("Hi" + i);

	}

}
