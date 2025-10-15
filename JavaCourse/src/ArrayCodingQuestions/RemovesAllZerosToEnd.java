package ArrayCodingQuestions;

//Given an array of integers arr[], the task is to move all the zeros to the end of the array 
//while maintaining the relative order of all non-zero elements.
public class RemovesAllZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 45, 0, 7, 0, 5, 0, 9, 0 };
		pushAllTheZerosToEnd(arr);
		for (int n : arr) {
			System.out.print(n + " ");
		}

	}

	private static void pushAllTheZerosToEnd(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		// creating a new array for storing the elements
		int[] newArr = new int[n];

		// removes non-zero elements to new Array
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				newArr[j++] = arr[i];
			}
		}

		// Fiiling remaining posisitions in newArr[] with Zero
		while (j < n) {
			newArr[j++] = 0;
		}
		//copy
		for(int i=0;i<n;i++) {
			arr[i]=newArr[i];
		}

		

	}

}
