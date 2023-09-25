package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
// Deserialization.
public class Empread {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//to read the object..
		String path="C:\\\\Users\\\\Mkgir\\\\eclipse-workspace\\\\QACA6_1\\\\src\\\\filehandling\\\\Object.txt";
		FileInputStream fis=new FileInputStream(path);
		
		ObjectInputStream oin=new ObjectInputStream(fis);
		
		Object oemp = oin.readObject();
		
		Employee emp=(Employee)oemp;  // Downcasting..
		System.out.println(emp.eid);//101
		System.out.println(emp.name);//Hemant
		System.out.println(emp.sal);//15000.0
		
		fis.close();
		oin.close();
		

	}
}
