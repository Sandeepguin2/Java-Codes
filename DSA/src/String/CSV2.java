package String;
//CSV=Comma separated values
public class CSV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="SANDEEP,SANJEEB,LIPSA,MAMUNI";
		String names[]=str.split(",");
		for(String values:names) {
			System.out.println(values);
		}

	}

}
