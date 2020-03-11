package examples;

public class JavaExample {

	public static void main(String[] args) {
		byte input = (byte) -2; // -2 (sigend) and 254 (unsigend)
		System.out.println(input); //-2
		System.out.println(convertBytesToUnsignedBytes(input)); // 254 

		System.out.println(Byte.toUnsignedInt(input)); // 254

	}

	public static int convertBytesToUnsignedBytes(Byte x) {
		// auto cast to int
		return x & 0xFF;

		// explicit cast
		//return ((int) x) & 0xFF;
	}

}
