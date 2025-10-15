package telusko;

class FourWheeler {
	String Name;
	int milage;
	int topspeed;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public int getTopspeed() {
		return topspeed;
	}

	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}

}

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourWheeler four = new FourWheeler();
		four.setName("VolksWagon");
		four.setMilage(4);
		four.setTopspeed(199);
		System.out.println(four.getName() + ":" + four.getMilage() + ":" + four.getTopspeed());

	}

}
