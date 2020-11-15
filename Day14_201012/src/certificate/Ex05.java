package certificate;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 15, b = 19;
		System.out.printf("%d\n", ~a);  //반전
		System.out.printf("%d\n", a^b); //모두 같으면 0, 서로 다르면 1
		System.out.printf("%d\n", a&b); //두 비트가 모두 1일때만, 1
		System.out.printf("%d\n", a|b); //두 비트 중 한 비트라도 1이면, 1
	}

}
