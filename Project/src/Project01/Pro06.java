package Project01;

import java.util.Scanner;

/*6. 입력한 성적가 짝수 인지 홀수 인지 판단하시오.
 * 1번에서 작성한 소스코드를 적극 활용하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점), 중복값은 없는 걸로 가정한다.
 * 출력 : 입력된 성적(성적)의 짝수/홀수 판단 유무 출력하기
 * 학습정보 : 단, 단독 if문 2개만 사용하여 출력하시오.
 */
//흰트 : == , != 
public class Pro06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생1의 이름을 입력하세요 >>");
		String student1 = scan.next();
		
		System.out.print("학생1의 성적을 입력하세요 >>");
		int num1 = scan.nextInt();
		
		if(num1%2 == 0)
			System.out.println("학생1의 성적는 짝수입니다.");
		if(num1%2 != 0)
			System.out.println("학생1의 성적는 홀수입니다.");
		//----------------------------------------------------------------------
		System.out.print("학생2의 이름을 입력하세요 >>");
		String student2 = scan.next();
		
		System.out.print("학생2의 성적을 입력하세요 >>");
		int num2 = scan.nextInt();
		
		if(num2%2 == 0)
			System.out.println("학생2의 성적는 짝수입니다.");
		if(num2%2 != 0)
			System.out.println("학생2의 성적는 홀수입니다.");
		//----------------------------------------------------------------------
		System.out.print("학생3의 이름을 입력하세요 >>");
		String student3 = scan.next();
		
		System.out.print("학생3의 성적을 입력하세요 >>");
		int num3 = scan.nextInt();
		
		if(num3%2 == 0)
			System.out.println("학생3의 성적는 짝수입니다.");
		if(num3%2 != 0)
			System.out.println("학생3의 성적는 홀수입니다.");
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
