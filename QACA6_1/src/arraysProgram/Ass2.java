package arraysProgram;
//wajp to print even index present in the Array.
public class Ass2 {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		System.out.println("Print all number present in Even Index");
		for (int i = 0; i < a.length; i++) {
			if (i%2==0) {
				System.out.println(a[i]);
			}
		}
	}
}
