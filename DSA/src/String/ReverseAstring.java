package String;

import java.util.Scanner;

//Two Ways
//1.Using customized logic
//2.using standrad JAVA API
public class ReverseAstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using our own logic
		//For this we will require two string object
		String original;     //for storing user input
		String reverse="";       //for sorting reverse of a string 
		
		//Now lets take input from user
		System.out.println("Enter a string to reverse: ");
		Scanner sc= new Scanner(System.in);
		original=sc.nextLine();
		int len=original.length();
		for(int i=len-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		//lets print both the string object
		System.out.println("Original String is: "+original);
		System.out.println("Reverse of string is: "+reverse);

	}

}
