package CodingForInterview;

import java.util.HashSet;
import java.util.Set;

//An isogram is a word or phrase without a repeating letter.

//Questions->>>>Check if a string is Isogram or not
//input:Lipsa
//output:true;
public class IsogramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sandeep";
		boolean b=isIsogram(str);
		System.out.println(b);

	}

	private static boolean isIsogram(String str) {
		// TODO Auto-generated method stub
		char[] ch=str.toCharArray();
		Set<Character> chSet=new HashSet<Character>();
		for(Character c:ch) {
			if(chSet.contains(c)) {
				return false;
			}else {
				chSet.add(c);
				
			}
		}
		
		return true;
	}

}
