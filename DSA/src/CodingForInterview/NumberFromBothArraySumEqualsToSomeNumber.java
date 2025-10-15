package CodingForInterview;

import java.util.HashSet;
import java.util.Set;
//This approach runs in O(n) time complexity, making it efficient. 🚀
public class NumberFromBothArraySumEqualsToSomeNumber {
	//Use a HashSet to store elements of one array for quick lookup.
	//Iterate through the other array and check if (target - current_element) exists in the set.
	//If found, print the pair.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int[] brr= {30,10,40,50,20};
		int target=50;
		findPairs(arr,brr,target);

	}

	private static void findPairs(int[] arr, int[] brr, int target) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<Integer>();
		
		//Add element arr to hashset     
		for(int n:arr) {
			set.add(n);
		}
		
		//Checking if (target-n) exists in brr
		for(int n:brr) {
			int complement=target-n;
			if(set.contains(complement)) {
				System.out.println(complement+","+n);
			}
			
			
		}
		
		
	}

}
