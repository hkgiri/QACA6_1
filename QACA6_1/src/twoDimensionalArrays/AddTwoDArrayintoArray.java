package twoDimensionalArrays;

import java.util.Iterator;

//wajp to Add two matrix by two dimension Integer Array.
public class AddTwoDArrayintoArray {
	public static void main(String[] args) {
		int[][]a= {{1,2,3},{1,2,3},{1,2,3}};
		int[][]b= {{1,2,3},{1,2,3},{1,2,3}};
		int[][]res=new int[a.length][a[0].length];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				res[i][j]=a[i][j]+b[i][j];
			}
		} 
		System.out.println("Elements of Result Arrays");
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
