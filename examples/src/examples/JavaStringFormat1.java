package examples;

public class JavaStringFormat1 {

	// https://www.dotnetperls.com/format-java
	public static void main(String[] args) {
		
		// Call String.format with three integer codes.
		String result = String.format("One: %1$d \nTwo: %2$d \nThree: %3$d",10, 20, 30);
		System.out.println(result);

	}

}
