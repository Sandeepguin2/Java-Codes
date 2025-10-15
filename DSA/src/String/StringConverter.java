package String;

public class StringConverter {
        //987bv68a667
	//98768667
	//askey value=48 to 57
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="987bv68a667";
		str=convert(str);
		System.out.println(str);

	}

	private static String convert(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)<48 || sb.charAt(i)>57) {
				sb.deleteCharAt(i);
				i--;
				
				
			}
		}
	
		return sb.toString();
	}

}
