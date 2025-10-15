package String;

public class InternMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Mamuni";
		String s2=new String("Mamuni");
		
		String s3=s2.intern();
		if(s3==s1) {
			System.out.println("The memory location having s1 is also indicating the s3 memory location and both have the same value in String constant pool");
		}else if(s3==s2) {
			System.out.println("They are indicating different memory location");
		}else {
			System.out.println("This is representing intern() method");
		}
		
		  

	}

}
