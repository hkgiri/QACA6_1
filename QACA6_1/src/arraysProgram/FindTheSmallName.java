package arraysProgram;

public class FindTheSmallName {
	public static void main(String[] args) {
		String[]s= {"Krishna","Radha","Ram","Sita"};
		String small=s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()<small.length()) {
				small=s[i];
			}
		}
		System.out.println("The Smallest Name is-->"+small);
	}
}
