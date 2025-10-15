package ArrayCodingQuestions;

import java.util.HashSet;

//Remove duplicates from sorted array
public class DuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
	        int newSizeWithUniqueElements = removeDuplicates(arr);

	        for (int i = 0; i < newSizeWithUniqueElements; i++) {
	            System.out.print(arr[i] + " ");
	        }
	}

	private static int removeDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		 HashSet<Integer> s = new HashSet<>();
	        
	        // To maintain the new size of the array
	        int k = 0;  

	        for (int i = 0; i < arr.length; i++) {
	            if (!s.contains(arr[i])) { 
	                s.add(arr[i]);  
	                arr[k++] = arr[i];  
	            }
	        }

	        // Return the size of the array 
	        // with unique elements
	        return k;
	}
}
