package telusko;
class Gelhu extends Object{
	public Gelhu() {
		super();
		System.out.println("In Gelhu Constructor");
	}
	public Gelhu(int n ) {
		super();
		System.out.println("In Gelhu Paramatrized Constructor");
	}
}
class Raja extends Gelhu{
	public Raja() {
		super();
		System.out.println("In Raja Constructor");
	}
	public Raja(int a) {
		this();
		System.out.println("In Raja Paramatrized Constructor");
	}
}
public class ThisKeyWordInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Raja obj= new Raja(12);
		
		

	}

}
