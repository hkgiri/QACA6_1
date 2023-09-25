package twoDimensionalArrays;

import java.util.Scanner;

//wajp to find the Smallest elements present in the two Dimensional Arrays.
public class FindSmallestElements {
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
		int small=a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j]<small) {
					small=a[i][j];
				}
			}
		}
		System.out.println("The Smallest Element in The Arrays is "+small);
		
	}
}
