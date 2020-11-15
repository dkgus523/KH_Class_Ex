package certificate;

public class Ex02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Programming";
		int n = str.length();
		char[] st = new char[n];
		n--;
		for(int k=n; k>=0; k--) {
			st[n-k] = str.charAt(k);
		}
		for(char k:st) {
			System.out.printf("%c",k);
		}
	}
}
