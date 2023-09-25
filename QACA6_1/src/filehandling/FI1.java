package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FI1 {
	public static void main(String[] args) throws IOException
	{
		//step1- create an Object of FileInputStream.
		//step2- initialize the Object with the path and name of the file.
		String path="C:\\\\Users\\\\Mkgir\\\\eclipse-workspace\\\\QACA6_1\\\\src\\\\filehandling";
		FileInputStream fis=new FileInputStream(path+"/F1.txt");
		//System.out.println(fis.read());
		char ch=(char)fis.read();
		System.out.println(ch);
		fis.close();
	}
}
