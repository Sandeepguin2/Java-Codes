package telusko;
class d{ 
	public void show() {
		System.out.println("in d show");
	}
}
class e extends d{
	public void show() {
		System.out.println("in e show");  
	}
}
class f extends d{
	public void show() {
		System.out.println("in f show");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d obj= new d();
		obj.show();
		
		obj=new e();
		obj.show();
		
		obj=new f();
		obj.show();
		
		
		
		//It is a example of runtime polymorphism and it will happens when one object having many behaviours 
		//Here in this example we create 1 object which is named as "obj" but it has many behaviours.
		//So it is called as dynamic method dispatch and it will only occur when you have inheritance.
		//Without inheritance dynamic method dispatch can't be happen.
	}

}
