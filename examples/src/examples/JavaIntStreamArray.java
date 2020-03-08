package examples;

import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.OptionalInt;

public class JavaIntStreamArray {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		// 1. int[]-> IntStream
		IntStream stream = Arrays.stream(num);
		// 2.OptionalInt
		OptionalInt any = stream.filter(x -> x % 2 == 0).findAny();
		// 3.getAsInt()
		int result = any.getAsInt();

		System.out.printf("Result : %d ", result); // 2 0r 4
	}

}
