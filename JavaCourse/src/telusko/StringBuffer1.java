package telusko;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("SANDEEP");
		System.out.println(sb.capacity());
		System.out.println(sb.append("Sandeep"));
		System.out.println(sb.delete(0, 2));
		System.out.println(sb.reverse());
		
		
		StringBuffer sb1=new StringBuffer("Lipsa");
		String str=sb1.toString();
		System.out.println(str);
		


	}

}
