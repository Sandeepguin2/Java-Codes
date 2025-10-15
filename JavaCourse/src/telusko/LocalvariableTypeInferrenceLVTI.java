package telusko;

import java.util.List;

//In Java, local variable type inference refers to the ability of the Java compiler to infer the type of a local variable from its initializer. This feature was introduced in Java 10 with the use of the var keyword.
//Instead of explicitly specifying the type of a variable, you can use the var keyword. The compiler infers the type based on the value assigned to the variable at initialization.
//Type inference is applicable only to local variables, such as those declared in methods, loops, or blocks.
//It cannot be used for class fields, method parameters, or return types.
//It can make code more concise and readable, especially when working with complex types, such as generic collections.
//Despite using var, Java remains strongly typed. The inferred type is determined at compile-time and does not change at runtime.
//A variable declared with var must be initialized at the time of declaration because the compiler needs the initializer to infer the type.
public class LocalvariableTypeInferrenceLVTI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Using var for simple types
		        var name = "Alice";       // String
		        var age = 25;             // int
		        var price = 99.99;        // double

		        // Using var for complex types
		        var list = List.of("Apple", "Banana", "Cherry"); // List<String>
		        for (var item : list) {
		            System.out.println(item);
		        }

		        // Using var in loops
		        for (var i = 0; i < 5; i++) {
		            System.out.println("Count: " + i);
		        }
		    }
		}



