package telusko;

//Updated Switch Statement
public class SwitchStatemen3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Switch Statement As Expression after java 7
		String day = "Monday";
		String r = "";
		r = switch (day) {
		case "Saturday":
			yield "7am";

		case "Monday":
			yield "8am";

		default:
			yield "6am";
		}; 
		System.out.println(r);

	}

}
