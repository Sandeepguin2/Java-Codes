package telusko;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		Integer num2=new Integer(22);//Boxing
		Integer num1=12;//Auto-boxing
		int num3=num2.intValue();
		System.out.println(num3);//unboxing
		System.out.println(num1);
		System.out.println(num2);

	}

}
 