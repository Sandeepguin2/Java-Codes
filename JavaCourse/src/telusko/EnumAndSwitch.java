package telusko;
enum SportsBike{
	BMWS1000RR,NinjaZX10R,DucatiPanigale,Hayabusa;
}
public class EnumAndSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsBike sp=SportsBike.DucatiPanigale;
		switch (sp) {
		case BMWS1000RR:
			System.out.println("Motorad");
			break;
		case NinjaZX10R:
			System.out.println("GreenBeast");
			break;
		case DucatiPanigale:
			System.out.println("Red Beauty");
			break;
		case Hayabusa:
			System.out.println("Dhoom Bike");
			break;
		default:
			System.out.println("EV's are worst");
			break;
		}

	}

}
