package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FO1 {
	public static void main(String[] args) throws IOException {
		//step1: create an object of FOS.
		//step2: pass the store path.
		String path="C:\\Users\\Mkgir\\eclipse-workspace\\QACA6_1\\src\\filehandling";
		FileOutputStream fout=new FileOutputStream(path+"/F1.txt");
		//step3: use write method to write the data
		//to write a character A
		char ch=65;
		fout.write(ch);
		System.out.println("character written into a file");
		
		//step4: close the resource
		fout.close();
	}
}
