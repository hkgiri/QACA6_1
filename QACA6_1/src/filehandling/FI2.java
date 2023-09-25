package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
//multiple data print by Deserialization. 

public class FI2 {
	public static void main(String[] args) throws IOException {
		String path="C:\\\\Users\\\\Mkgir\\\\eclipse-workspace\\\\QACA6_1\\\\src\\\\filehandling\\\\Leela.txt";
		FileInputStream fis=new FileInputStream(path);
		/*for (int i = 0; i <12; i++) {
			System.out.print((char)fis.read());
		}*/
		//step3: to read the data using method.
		
		/*int a=fis.read();
		while(a!=-1)
		{
			System.out.print((char)a);
			a=fis.read();
		}*/
		
		byte[] b=new byte[fis.available()];
		fis.read(b);
		for (byte c : b) {
			System.out.print((char)c);
		}
		fis.close();
	}
}
