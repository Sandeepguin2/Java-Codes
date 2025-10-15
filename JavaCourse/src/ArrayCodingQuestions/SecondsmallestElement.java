   package ArrayCodingQuestions;

import java.util.Arrays;

//Question: Given an array of integers,write a java 8 program to find the second smallest element
//Input:int[] nums={5,2,8,3,1}
//hr may ask for any duplictate elements
public class SecondsmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {5,2,8,3,1,1};
		fetchSecondSmallest(nums);

	}

	private static void fetchSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		int secondSmallestelement=Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(()-> new IllegalArgumentException());
		System.out.println(secondSmallestelement);
		
	}

}
