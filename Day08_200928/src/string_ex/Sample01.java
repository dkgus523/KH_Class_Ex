package string_ex;

public class Sample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		
		int len = str.length();
		
		System.out.println(str + " 의 첫 번째 문자는 " + ch1);
		System.out.println(str + " 의 두 번째 문자는 " + ch2);
		System.out.println(str + "길이는 " + len);
	}

}
