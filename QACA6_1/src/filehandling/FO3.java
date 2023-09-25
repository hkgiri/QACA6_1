package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

//multiple handle the data in Serialization.
public class FO3 {
	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\Mkgir\\eclipse-workspace\\QACA6_1\\src\\filehandling\\Leela.txt";
		FileOutputStream fos=new FileOutputStream(path);
		String data="All The Best";
		byte[] b= data.getBytes();
		fos.write(b);
		System.out.println("Done.... Written");
		
	}
}
