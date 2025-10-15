package telusko;

import java.util.Objects;

class chain{
	int price;
	String durability;
	@Override
	public String toString() {
		return "chain [price=" + price + ", durability=" + durability + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(durability, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		chain other = (chain) obj;
		return Objects.equals(durability, other.durability) && price == other.price;
	}
	
}
public class TostrinAndHashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chain obj= new chain();
		obj.price=1000;
		obj.durability="Strong";
		System.out.println(obj);

	}

}
