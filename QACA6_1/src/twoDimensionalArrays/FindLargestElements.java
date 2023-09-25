package twoDimensionalArrays;

import java.util.Scanner;

//wajp to find the Largest elements present in the two Dimensional Arrays.
public class FindLargestElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Numbers of Rows");
		int row=sc.nextInt();
		System.out.println("Enter The Numbers of Columns");
		int col=sc.nextInt();
		int[][]a=new int[row][col];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter the Elements into the Arrays "+(i+1)+" Row");
				a[i][j]=sc.nextInt();
			}
		}
		int large=a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j]>large) {
					large=a[i][j];
				}
			}
		}
		System.out.println("The Largest Element in The Arrays is "+large);
		
	}
}
