package stringClass;
//wajp to count the Accurency of each characters in a String.
public class AccurencyOfCharecters {
	public static void main(String[] args) {
		String s="aaabbcdeefg";
		char[]ch=s.toCharArray();
		boolean[]b=new boolean[ch.length];
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			if (b[i]==false) {
				for (int j = 0; j < b.length; j++) {
					if (ch[i]==ch[j]) {
						count++;
						b[j]=true;
					}
				}
				System.out.println(ch[i]+" : "+count);
			}
		}
	}
}

