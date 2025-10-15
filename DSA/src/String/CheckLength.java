package String;

import java.util.Scanner;

public class CheckLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1,S2;
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter 2 strings");
		S1=sc.nextLine();
		S2=sc.nextLine();
	
		
		int l1=S1.length();
		int l2=S2.length();
		
		 System.out.println("String length S1:"+l1);
		 System.out.println("String length S1:"+l2);
		 
		 String S3=S1.concat(S2);
		 System.out.println("Concat Done:"+S3);
		 
		 
		 S1=S1.toUpperCase();
		 System.out.println("!st string in upper case:"+S1);


	}

}
