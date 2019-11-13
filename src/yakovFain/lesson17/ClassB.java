package yakovFain.lesson17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClassB {

	public static void main(String args[]) {

		try (FileInputStream fIn = new FileInputStream(
				"C:\\Users\\User\\git\\repository\\BookJavaThinkingInJava\\src\\yakovFain\\lesson17\\BestEmployee.ser");
				ObjectInputStream oIn = new ObjectInputStream(fIn);) {

			Employee bestEmp = (Employee) oIn.readObject();

		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("The Employee  object has been deserialized.");
	}

}
