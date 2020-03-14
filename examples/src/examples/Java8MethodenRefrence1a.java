package examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8MethodenRefrence1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("A", "B", "C");
		// anonymous class
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				SimplePrinter.print(t);

			}

		});
		
		// lambda expression
		list.forEach(x -> SimplePrinter.print(x));
		// method reference
		list.forEach(SimplePrinter::print);
	}

}

class SimplePrinter {
	public static void print(String str) {
		System.out.println(str);
	}
}
