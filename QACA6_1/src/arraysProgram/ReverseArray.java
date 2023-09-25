package arraysProgram;
//wajp to reverse an Integer Array
public class ReverseArray {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int index2 = a.length-1;
		/*for (int i = 0; i < index; i++) {
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
			index--;
		}*/
		int index1=0;
		while (index1<index2) {
			int temp=a[index1];
			a[index1]=a[index2];
			a[index2]=temp;
			index1++;
			index2--;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
