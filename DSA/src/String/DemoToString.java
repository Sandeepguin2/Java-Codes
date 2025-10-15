package String;
class student{
	public student(int rollno, String sname) {
		super();
		this.rollno = rollno;
		this.sname = sname;
	}
	int rollno;
	String sname;
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", sname=" + sname + "]";
	}
}
public class DemoToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1= new student(11,"Navin");
		System.out.println(s1);
		System.out.println(s1);
		

	}

}
