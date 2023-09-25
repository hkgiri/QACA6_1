package arraysProgram;
//wajp to print Odd elements present in the Array.
public class Ass1 {
	public static void main(String[] args) {
		int[] a= {11,15,40,21,8};
		System.out.println("it is odd Elements");
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}
}
