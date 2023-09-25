package arraysProgram;
//wajp to print the dublicate elements with count repeated element.
public class PrintDublicaterepeatedelementandCount {
	public static void main(String[] args) {
		int[]a= {10,20,30,20,30,15,60,30,30,15};
		boolean[]b=new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			int count=0;
			if (b[i]==false) {
				for (int j =i+1; j < a.length; j++) {
					if (a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
				if (count>=1) {
					System.out.println(a[i]+"==>"+count);
				}
			}
		}
	}
}
