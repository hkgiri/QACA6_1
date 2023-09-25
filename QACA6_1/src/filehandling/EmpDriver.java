package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//Serialization.s
class Employee implements Serializable
{
	int eid;
	String name;
	double sal;
	Employee(){}
	public Employee(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	
}
public class EmpDriver {
	public static void main(String[] args) throws IOException {
		String path="C:\\\\Users\\\\Mkgir\\\\eclipse-workspace\\\\QACA6_1\\\\src\\\\filehandling\\\\Object.txt";
		FileOutputStream fos=new FileOutputStream(path);
		
		ObjectOutput oout=new ObjectOutputStream(fos);
		
		// to write an Employee Object.
		Employee e1=new Employee(101,"Hemant",15000);
		oout.writeObject(e1);
		System.out.println("Object written into the file..");
		fos.close();
		oout.close();
		
	}
}
