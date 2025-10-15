package ArrayCodingQuestions;

import java.util.ArrayList;
import java.util.List;

public class ReverseAnArrayListWithoutInBuildMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		System.out.println("Before reversing");
		for(int n : nums) {
			System.out.print(n);
		}
		
		int left=0;
		int right=nums.size()-1;
		int temp=0;
		
		while(left<right) {
			temp=nums.get(left);
			nums.set(left, nums.get(right));
			nums.set(right,temp);
			
			left++;
			right--;
		}
		
		
		
		
		System.out.println();
		System.out.println("After Reversing");
		for(int n:nums) {
			System.out.print(n);
		}
	

	}

}
