package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FO2 {
	public static void main(String[] args) throws IOException {
		//step1: create an object of FOS.
		//step2: pass the store path.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the path ");
		
		String path=sc.next();
		FileOutputStream fout=new FileOutputStream(path);
		//step3: use write method to write the data
		//to write a character A
		System.out.println("pass the character input");
		char ch=sc.next().charAt(0);
		fout.write(ch);;
		System.out.println("character written into a file");
		
		//step4: close the resource
		fout.close();
	}
}
