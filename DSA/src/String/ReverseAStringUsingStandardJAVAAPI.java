package String;

import java.util.Scanner;

public class ReverseAStringUsingStandardJAVAAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original;
		String reverse="";
		System.out.println("Enter string to reverse: ");
		Scanner sc= new Scanner(System.in);
		original=sc.nextLine();
		//for this method e need object of stringbuffer
		StringBuffer sb= new StringBuffer(original);
		reverse=sb.reverse().toString();
		System.out.println("Original String is: "+original);
		System.out.println("Reverse of string is: "+reverse);
		
		
		

	}

}
