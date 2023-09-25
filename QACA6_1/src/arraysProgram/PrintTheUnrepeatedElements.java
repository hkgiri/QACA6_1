package arraysProgram;
//wajp to print Unrepeated Elements in the Integer Array.
public class PrintTheUnrepeatedElements {
	public static void main(String[] args) {
		int[]a= {10,20,10,40,60,50,70,60,50};
		boolean[]b=new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			int count=0;
			if(b[i]==false) {
				for (int j = i+1; j < a.length; j++) {
					if (a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
				if (count<=0) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
