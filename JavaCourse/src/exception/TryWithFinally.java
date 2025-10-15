package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//We use try with finally to close the resources.when we want to print a statement irrespective of its give exception or not the  in finally block we will print 
public class TryWithFinally {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int num = 0;
		BufferedReader bf = null;

		try {
			InputStreamReader input = new InputStreamReader(System.in);
			bf = new BufferedReader(input);
			num = Integer.parseInt(bf.readLine());
			System.out.println(num);
			bf.close();

		} finally {
			bf.close();

		}

	}

}
