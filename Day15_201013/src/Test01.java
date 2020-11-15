

class Scanner{
	public Scanner() {
		System.out.println("내가 만든 Scanner");
	}
}
public class Test01 {
//여기에 키보드로 숫자 2개를 입력받아, 두 수의 합을 구하는 프로그램을 작성해주세요.
//구글 검색 필수 (같은 패키지내에 동일 이름 클래스 사용하기)
	Scanner scan = new Scanner();
	java.util.Scanner input = new java.util.Scanner(System.in);
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	
	System.out.println("두 수의 합은 : " + (num1 + num2));

}
