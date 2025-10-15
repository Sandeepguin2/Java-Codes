package exception;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int j = 0;
		int nums[] = new int[5];
		String str = null;
		try {
			j = 6 / i;
			System.out.println(str.length());
			System.out.println(nums[0]);
			System.out.println(nums[4]);
		} catch (ArithmeticException e) {
			System.out.println("cannot divided by zero");
		} catch (NullPointerException e) {
			System.out.println("Empty value");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of bound");
		} catch (Exception e) {
			System.out.println("Something went wrong" + e);
		} finally {
			System.out.println("whatever");
		}

	}

}
