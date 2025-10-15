package telusko;
enum Status{
	Running, Failed, Pending, Success;   //Named Constants
}
public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Status s=Status.Success;
		System.out.println(s.ordinal());
		
		Status[] st=Status.values();
		for (Status status : st) {
			System.out.println(status+" : "+status.ordinal());
		}

		

	}

}
