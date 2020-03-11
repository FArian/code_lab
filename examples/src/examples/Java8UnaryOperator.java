package examples;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

public class Java8UnaryOperator {

	public static void main(String[] args) {
		
		Function<Integer, Integer> func = x -> x * 2;
		Integer result = func.apply(2);
		System.out.println("=========");
		System.out.println("RESULT: " + result);
		System.out.println("---------");
		UnaryOperator<Integer> func2 = x -> x * 2;
		Integer result2 = func2.apply(2);
		System.out.println("RESULT: " + result2);
		System.out.println("=========");

	}

}
