package twoDimensionalArrays;

import java.util.Scanner;

//wajp to find the sum of elements present in the Two Dimentional Integer Arrays.
public class SumOf2DArrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number Of Rows");
		int row=sc.nextInt();
		System.out.println("Enter The Number Of columns");
		int col=sc.nextInt();
		int[][]a=new int[row][col];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter The Elements in the "+(i+1)+" Row");
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		System.out.println("Print Entered Elements is ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
				sum=sum+a[i][j];
			}
			System.out.println();
		}
		System.out.println("Sum of the Elements is "+sum);
	}

}
