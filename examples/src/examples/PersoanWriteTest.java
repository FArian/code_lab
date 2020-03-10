package examples;

import java.io.*;

public class PersoanWriteTest {

	public static void main(String[] args) 
			throws FileNotFoundException, IOException {
		try (ObjectOutputStream out = 
				new ObjectOutputStream(
						new FileOutputStream("person.bin"))) {
			out.writeObject(new PersonRecord("Heinz", "Michi"));
			out.writeObject(new PersonRecord("Farhad", "Sara"));
			out.writeObject(null);

		}

	}

}
