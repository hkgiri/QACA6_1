package arraysProgram;
//wajp to find largest length name present in a string. 
public class FindTheLargeName {
	public static void main(String[] args) {
		String[]s= {"Krishna","Radha","Ram","Sita"};
		String large=s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()>large.length()) {
				large=s[i];
			}
		}
		System.out.println("The Large Name is-->"+large);
	}
}
