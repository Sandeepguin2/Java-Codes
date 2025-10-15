package DSA.LinkedListAddingAValue;

public class LinkedListAddvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> nums = new LinkedList<Integer>();
		nums.add(5);
		nums.add(9);

		nums.add(6);
		nums.addFirst(7);
		nums.delete(9);
		
//		System.out.println(nums.get(2));
//		System.out.println(nums.peek());
		nums.printValues();

	}

}
