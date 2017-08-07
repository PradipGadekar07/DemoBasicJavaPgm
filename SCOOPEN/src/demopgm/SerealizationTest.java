// Java code for serialization and deserialization of a Java object
/* 
 * @author Pradip Gadekar*/
package demopgm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Demo implements java.io.Serializable {
	public static int a;
	public String b;

	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}

}

class SerealizationTest {
	public static void main(String[] args) {
		Demo object = new Demo(7, "MS Dhoni");
		String filename = "file.txt";
		System.out.println("value before Serealization\na=" + object.a + " b=" + object.b);
		// Serialization
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		Demo object1 = null;

		// Deserialization
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			object1 = (Demo) in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

	}
}