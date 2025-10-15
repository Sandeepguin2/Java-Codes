package telusko;

class Calc  {
	public int add(int n1, int n2) {
		return n1 + n2;

	}

	public int sub(int n1, int n2) {
		return n1 - n2;

	}
}
class AdvCalc extends Calc{
	public int multi(int n3,int n4) {
		return n3*n4;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvCalc obj=new AdvCalc();
		int r1=obj.add(5, 9);
		int r2=obj.sub(5, 5);
		int r3=obj.multi(5, 8);
		System.out.println(r1+ ":"+r2+":"+r3);

	}

}
