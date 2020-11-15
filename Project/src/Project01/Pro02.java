package Project01;

import java.util.Scanner;

/*2. 총합계를 구하시오.
 * 1번에서 작성한 소스코드를 적극 활용하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점) 
 * 출력 : 입력된 점수의 총 합계 출력
 * 학습정보 : 덧셈 연산자
 */
public class Pro02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생1의 이름을 입력하세요 >>");
		String student1 = scan.next();
		
		System.out.print("학생2의 이름을 입력하세요 >>");
		String student2 = scan.next();
		
		System.out.print("학생3의 이름을 입력하세요 >>");
		String student3 = scan.next();
		
		
		System.out.print("학생1의 성적을 입력하세요 >>");
		int num1 = scan.nextInt();
		
		System.out.print("학생2의 성적을 입력하세요 >>");
		int num2 = scan.nextInt();
		
		System.out.print("학생3의 성적을 입력하세요 >>");
		int num3 = scan.nextInt();
		
		//if(num1 > 100 && num1 > 100 && num1 > 100 )
		//	System.out.println("성적은 100점 만점입니다. 다시 입력해주세요.");
		
		System.out.println("학생1 정보 : " + student1 + " " + num1 );
		System.out.println("학생2 정보 : " + student2 + " " + num2 );
		System.out.println("학생3 정보 : " + student3 + " " + num3 );
		
		System.out.println("학생 성적 총 합계 : " + (num1 + num2 + num3));
		
		
	}
}
