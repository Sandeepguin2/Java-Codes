package StreamOperations;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnSortedArrayIntoASingleSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 7, 8, 5, 2 };
		int[] brr = { 7, 4, 1, 5, 2, 8 };
		merge(arr, brr);

	}

	private static void merge(int[] arr, int[] brr) {
		// TODO Auto-generated method stub

		int[] a = IntStream.concat(Arrays.stream(arr), Arrays.stream(brr)).sorted().distinct().toArray();
		System.out.println(Arrays.toString(a));

	}

}
