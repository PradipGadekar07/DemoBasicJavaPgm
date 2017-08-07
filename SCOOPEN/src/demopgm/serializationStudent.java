package demopgm;
//Java code for serialization and deserialization of a Java object
/* 
* @author Pradip Gadekar*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo1 implements Serializable {
	public int sid;
	public String nm;
	address adr;
	public Demo1(int sid, String nm, address adr) {
		super();
		this.sid = sid;
		this.nm = nm;
		this.adr = adr;
	}
	
}
public class serializationStudent {
	public static void main(String[] args) {
		address add = new address("A2", "ranchi", 12212);
		Demo1 object = new Demo1(111,"MSD",add);
		
		String filename = "fileofarress.txt";
		
		System.out.println("value before Serealization\nid=" + object.sid + "name=" + object.nm+"address="+object.adr);
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
			System.out.println("a = " + object.sid);
			System.out.println("b = " + object.nm);
			System.out.println("b = " + object.adr);
			
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

	}

	@Override
	public String toString() {
		return "serializationStudent []";
	}
}