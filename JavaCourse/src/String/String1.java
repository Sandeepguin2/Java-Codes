package String;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sandeep";  //This is in String constant pool as String literal
		String s2=new String("Sandeep");//This new object created in heap memory
		if(s1==s2) {
			System.out.println("both are indicating same memory location");
		}else
		{
			System.out.println("They have different memory location");
		}

	}

}
