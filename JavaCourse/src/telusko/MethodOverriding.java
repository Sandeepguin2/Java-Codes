package telusko;
class a{
	public void show() {
		System.out.println(" in A show");
	}
	public void config() {
		System.out.println("in A config");
	}
}
class b extends a{
	public void show () {
		System.out.println("in B show");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b bj=new b();
		bj.show();
		bj.config();

	}

}
