package ArrayCodingQuestions;

import java.util.Arrays;

//Question:Given an array of non-negative integers represented as strings, write a function to arrange them 
//         such that they form the largest possible number when concatenated.
//Example Input:
//["3", "30", "34", "5", "9"]

//Example Output:
//9534330
public class LargetPossibleeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "3", "30", "34", "5", "9" };
		System.out.println(largestPossibleNumber(str));

	}

	private static String largestPossibleNumber(String[] str) {
		// TODO Auto-generated method stub
		Arrays.sort(str, (n1, n2) -> (n2 + n1).compareTo(n1 + n2));
		String arr = "";
		for (String s : str) {
			arr = arr + s;
		}

		return arr;
	}

}
