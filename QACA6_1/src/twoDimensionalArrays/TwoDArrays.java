package twoDimensionalArrays;
//Store in Two Arrays by new Operator.
public class TwoDArrays {
	public static void main(String[] args) {
		int[][]a=new int[2][3];
		System.out.println(a);//[[I@515f550a
		System.out.println(a[0]);//[I@cac736f
		System.out.println(a[1]);//[I@5e265ba4
		System.out.println(a[0].length);//3
		System.out.println(a[1].length);//3
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=10;
		a[1][1]=20;
		a[1][2]=30;
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
3
3
3
10 20 30 
10 20 30 
*/