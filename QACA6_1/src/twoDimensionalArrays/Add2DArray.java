package twoDimensionalArrays;

import java.util.Scanner;

//wajp to create two dimentional Integer Arrays read the element from the user and then print the elements.  
public class Add2DArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number of Rows");
		int row=sc.nextInt();
		System.out.println("Enter The Number of Columns");
		int col=sc.nextInt();
		int[][]a=new int[row][col];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter The Elements in the Arrays in "+(i+1)+" Row");
				int num=sc.nextInt();
				a[i][j]=num;
			}
		}
		System.out.println("Print Entered Elements");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}
}
