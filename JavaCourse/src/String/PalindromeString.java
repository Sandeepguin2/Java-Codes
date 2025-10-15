package String;

class Solution {
	boolean isPalindrome(String s) {
		// code here
		String s1="abbal";
		for (int i = 0; i < s1.length() / 2; i++) {
			if (s1.charAt(i) != s1.charAt(s1.length()  - 1)) {
				return false; // Not a palindrome
			}
		}
		return true; // Is a palindrome

	}
}

public class PalindromeString {

	public static void main(String[] args) {
		Solution sol=new Solution();
		System.out.println(sol.isPalindrome(null));

	}

}
