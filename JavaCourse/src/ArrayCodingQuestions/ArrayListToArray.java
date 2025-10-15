package ArrayCodingQuestions;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array list
		List<String> values=new ArrayList<String>();
		values.add("Apple");
		values.add("Mango");
		values.add("Grapes");
		
		//Convert into array
		String[] arr=new String[values.size()];
		arr=values.toArray(arr);
		
		//Printing the array
		System.out.println("Array:");
		for(String s:arr) {
			System.out.println(s+"");
		}
		
		
		
		
 
	}

}
