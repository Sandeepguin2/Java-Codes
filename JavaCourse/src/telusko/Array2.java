package telusko;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String students[]=new String[4];
		students[0]="Lipsa";
		students[1]="Sandeep";
		students[2]="Sabitri";
		students[3]="Ramesh";
		for(int i=0;i<=3;i++) {
			System.out.println(students[i]);
		}
		//For getting the length of an array
		int length=students.length;
		System.out.println(length  );

	}

}
