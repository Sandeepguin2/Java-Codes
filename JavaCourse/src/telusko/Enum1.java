package telusko;
enum Students{
	Sandeep,Sanjeeb,Lipsa,Mamuni;
}
public class Enum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students[] s=Students.values();
		for(Students stud:s) {
			System.out.println(stud+":"+stud.ordinal());
		}

	}

}
