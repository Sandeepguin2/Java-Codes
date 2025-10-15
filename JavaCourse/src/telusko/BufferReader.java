package telusko;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BufferReader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		 InputStreamReader in=new InputStreamReader(System.in);
		 BufferedReader bf= new BufferedReader(in);
		 
		 int num=Integer.parseInt(bf.readLine());
		 System.out.println(num);
		 bf.close();

	}

}
