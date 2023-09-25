package stringClass;
//wajp to find the length of the String without using length method.
public class S2 {
	public static void main(String[] args) {
		String s="Hemant";
		int count=0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count++;
		}
		System.out.println("Character Size is "+count);
	}
}
