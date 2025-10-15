package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintMultiplesOf5FromALIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(10,20,5,87);
		List<Integer> num=nums.stream()
				.filter(n->n%5==0)
				.collect(Collectors.toList());
		System.out.println(num);

	}

}
