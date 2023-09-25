package arraysProgram;
//wajp to print even elements present the Array.
public class A4 {
	public static void main(String[] args) {
		int[] a= {10,7,8,4,6,20};
		System.out.println("THis is Even Numbers");
		for (int i = 0; i < a.length; i++) {
			int b=a[i];
			if (b%2==0) {
				System.out.println(b);
			}
		}
	}
}
