package arraysProgram;

import java.util.Scanner;

public class FindTheElementInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]a= {10,50,40,60,20,70,80,90};
		System.out.println("Enter The searching Key");
		int key=sc.nextInt();
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if (key==a[i]) {
				count++;
				break;
			}
		}
		if (count!=0) {
			System.out.println("Key Element is Found "+key);
		}
		else
			System.out.println("Key Element is not Found "+key);
		
	}
}
