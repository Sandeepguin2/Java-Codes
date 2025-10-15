package ArrayCodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Question:Given two array of integers, write a java program to find the common elements between them
public class CommonElementBetween2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 4, 5, 6, 7, 8, 1 };
		findCommonElements(arr1, arr2);

	}

	private static void findCommonElements(int arr1[], int arr2[]) {
		// TODO Auto-generated method stub
		List<Integer> commonElements = Arrays.stream(arr1)
				.filter(number -> Arrays.stream(arr2).anyMatch(arr2Number -> arr2Number == number)).boxed()
				.collect(Collectors.toList());
		System.out.println(commonElements);
	}

}
