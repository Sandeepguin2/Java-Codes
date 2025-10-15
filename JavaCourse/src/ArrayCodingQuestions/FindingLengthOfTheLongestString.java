package ArrayCodingQuestions;

import java.util.Arrays;

//Question:->Given an array of strings,write a java program to find the length of the longest string
public class FindingLengthOfTheLongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"Apple","Banana","Avocado","Apricot","Grapes"};
		fetchTheLongeststringInArray(str);
		
		

	}

	private static void fetchTheLongeststringInArray(String[] str) {
		// TODO Auto-generated method stub
		int maxLength= Arrays.stream(str).mapToInt(string->string.length()).max().orElse(0);
		System.out.println(maxLength);
		
	}

}
