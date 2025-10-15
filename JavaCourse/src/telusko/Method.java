package telusko;
class Computer{
	//This Method Does not return it only perform the operation
	public void playMusic(){
		System.out.println("Playing Music");
	}
	//This method return Something and it will accept an argument.
	public String getMeAPen(int cost) {
		return "pen";
	}
}
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com=new Computer();
		com.playMusic();
		com.getMeAPen(20);
		System.out.println(	com.getMeAPen(20));

	}

}
