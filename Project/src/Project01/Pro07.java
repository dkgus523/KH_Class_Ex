package Project01;

import java.util.Scanner;

/*7. 학점 계산 프로그램을 작성하시오.
 * 1번에서 작성한 소스코드를 적극 활용하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점), 중복값은 없는 걸로 가정한다.
 * 출력 : 입력된 성적(점수)가 90점 이상이면 A학점, 
 * 89~80점이면 B학점, 79점 이하면 F학점으로 출력
 * 학습정보 : 단, 단독 if~else if문 사용하세요.
 */
public class Pro07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생1의 이름을 입력하세요 >>");
		String student1 = scan.next();
		
		System.out.print("학생1의 성적을 입력하세요 >>");
		int num1 = scan.nextInt();
		
		if(num1 >= 90)
			System.out.println("A학점");
		else if(80<=num1 && num1<90)
			System.out.println("B학점");
		else
			System.out.println("F학점");
		//----------------------------------------------------------------------
		System.out.print("학생2의 이름을 입력하세요 >>");
		String student2 = scan.next();
		
		System.out.print("학생2의 성적을 입력하세요 >>");
		int num2 = scan.nextInt();
		
		if(num2 >= 90)
			System.out.println("A학점");
		else if(80<=num2 && num2<90)
			System.out.println("B학점");
		else
			System.out.println("F학점");
		//----------------------------------------------------------------------
		System.out.print("학생3의 이름을 입력하세요 >>");
		String student3 = scan.next();
		
		System.out.print("학생3의 성적을 입력하세요 >>");
		int num3 = scan.nextInt();
		
		if(num3 >= 90)
			System.out.println("A학점");
		else if(80<=num3 && num3<90)
			System.out.println("B학점");
		else
			System.out.println("F학점");
		//----------------------------------------------------------------------
		//if(num1 > 100 && num1 > 100 && num1 > 100 )
		//	System.out.println("성적은 100점 만점입니다. 다시 입력해주세요.");
		//if(num1 == num2 && num1 == num3 && num2 == num3 )
		//	System.out.println("성적은 중복이 되면 안됩니다. 다시 입력해주세요.");
		
		System.out.println("학생1 정보 : " + student1 + " " + num1 );
		System.out.println("학생2 정보 : " + student2 + " " + num2 );
		System.out.println("학생3 정보 : " + student3 + " " + num3 );
		
	}

}
