package ArrayCodingQuestions;
//equalsIgnoreCase() is a case-sensitive string comparison method in java .
import java.util.Arrays;
import java.util.List;

public class equalsIgnore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Sandeep","Kiran");
		String search="Lipsa";
		boolean found=names.stream()
				.anyMatch(name->name.equalsIgnoreCase(search));
		System.out.println(found);
		

	}

}
