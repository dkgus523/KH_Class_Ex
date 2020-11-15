package Project01;

import java.util.Scanner;

/*10. static 멤버필드, static 메소드 활용하여 프로그램 작성하기
 * 8번에서 작성한 소스코드를 활용하세요.
 * 멤버필드 : 학생 이름과 성적(100점 만점)입력 시킬 배열
 * 메소드 : input(), output() 
 * 메소드 input()의 경우 Scanner를 사용하여 사용자로부터 한꺼번에 입력받도록한다.
 * 메소드 output()의 경우 input()이 실행된 후 output() 출력이 실행되도록 한다.
 * 마지막 "프로그램이 종료되었다"는 안내메시지를 띄운다.
 * 학습정보 : static
 */

public class Pro10 {
	
	static String student ; //학생 이름
	static int num ;//학생 점수
	static int i=0;
	
	static void input() {
		Scanner scan = new Scanner(System.in);
		
		String[] student = new String[3];
		int[] num = new int[3];
		
		for(i=0; i<3; i++) {
			System.out.print("학생 " + (i+1) + "의 이름을 입력하세요 >>");
			student[i] = scan.next();
			System.out.print("학생 " + (i+1) + "의 성적을 입력하세요 >>");
			num[i] = scan.nextInt();
		
			System.out.println("학생 " + (i+1) + "정보 : " + student[i] + " " + num[i] );
		}
		
	}
	static void output() {
		input();
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	
	
	public static void main(String[] args) {
		Pro10.output();
	}
}
