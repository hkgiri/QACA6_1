package twoDimensionalArrays;
//Declare and inislization Statetment.
public class TwoDArrays1 {
	public static void main(String[] args) {
		int[][]a= {{10,20,30},{40,50,60}};
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
/*
[[I@515f550a
[I@cac736f
[I@5e265ba4
10 20 30 
40 50 60 
*/