package examples;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Java8BinaryOprator1 {

	public static void main(String[] args) {
		// BiFunction 
		BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
		Integer result= func.apply(2, 3);
		
		System.out.println("BiFunction RESULT : " +result);
		System.out.println("--------------------------");
		// BinaryOperator
		BinaryOperator<Integer> func2 = (x1, x2) -> x1 + x2;
		
		Integer result2=func2.apply(2, 3);
		System.out.println("BinaryOperator RESULT : " +result2);
	}

}
