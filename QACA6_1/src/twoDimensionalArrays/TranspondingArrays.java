package twoDimensionalArrays;
//wajp to transfer the matrix .
public class TranspondingArrays {
	public static void main(String[] args) {
		int[][]a= {{1,2,3},{4,5,6}};
		int[][]res=new int[a[0].length][a.length];
		System.out.println("Before Transponding");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				res[i][j]=a[j][i];
			}
		}
		System.out.println("After Transponding");
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
