package CodingForInterview;

public class CountOfTheCharcater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="SandeepBMWGuinBMWBMW";
	String s1="BMW";
	int count =0;
	int index=0;
	while((index=str.indexOf(s1,index))!=-1) {
		count++;
		index+=s1.length();
	}
	System.out.println("Occurrences of '" + s1 + "': " + count);

	}

}
