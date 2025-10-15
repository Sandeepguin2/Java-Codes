package telusko;
class home{
	private String fridge;
	private String Ac;
	public home() {
	
	}
	public home(String f,String a) {
		fridge=f;
		Ac=a;
	}
	public String getFridge() {
		return fridge;
	}
	public void setFridge(String fridge) {
		this.fridge = fridge;
	}
	public String getAc() {
 		return Ac;
	}
	public void setAc(String ac) {
		Ac = ac;
	}
	
}
public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		home h=new home("Whirlpool","LG");
		home h1=new home();
		System.out.println(h.getFridge()+":"+h.getAc());

	}

}
