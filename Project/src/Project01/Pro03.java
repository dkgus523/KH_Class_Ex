package Project01;

import java.util.Scanner;

/*3. max값과 min값을 찾아 출력하세요.
 * 1번에서 작성한 소스코드를 적극 활용하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점), 중복값은 없는 걸로 가정한다.
 * 출력 : 입력된 성적(점수)들 중 최대값과, 최소값을 출력하세요.
 * 학습정보 : 삼항연산자(if문은 사용하지 마세요)
 */

//최대값, 최소값 삼항연산자
//흰트 : int max = aScore > bScore ? aScore : bScore;
public class Pro03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생1의 이름을 입력하세요 >>");
		String student1 = scan.next();
		System.out.print("학생1의 성적을 입력하세요 >>");
		int num1 = scan.nextInt();
		
		System.out.print("학생2의 이름을 입력하세요 >>");
		String student2 = scan.next();
		System.out.print("학생2의 성적을 입력하세요 >>");
		int num2 = scan.nextInt();
		
		System.out.print("학생3의 이름을 입력하세요 >>");
		String student3 = scan.next();
		System.out.print("학생3의 성적을 입력하세요 >>");
		int num3 = scan.nextInt();
		
		//if(num1 > 100 && num1 > 100 && num1 > 100 )
		//	System.out.println("성적은 100점 만점입니다. 다시 입력해주세요.");
		//if(num1 == num2 && num1 == num3 && num2 == num3 )
		//	System.out.println("성적은 중복이 되면 안됩니다. 다시 입력해주세요.");
		
		System.out.println("학생1 정보 : " + student1 + " " + num1 );
		System.out.println("학생2 정보 : " + student2 + " " + num2 );
		System.out.println("학생3 정보 : " + student3 + " " + num3 );
		
		int max = num1 > num2 ? num1 : num2;
		max = max > num3 ? max : num3;
		
		int min = num1 > num2 ? num2 : num1;
		min = min > num3 ? num3 : min;
		
		/*
		int max = 0;
		max = num1 > num2 && num1 > num3 && num2 > num3 ? num1 : num3 ;
		max = num2 > num1 && num2 > num3 && num1 > num3 ? num2 : num3;
		max = num3 > num1 && num3 > num2 && num1 > num2 ? num3 : num2;
		
		int min = 0;
		min =  num1 < num2 && num1 < num3 && num2 < num3 ? num1 : num3 ;
		max = num2 < num1 && num2 < num3 && num1 < num3 ? num2 : num3;
		max = num3 < num1 && num3 < num2 && num1 < num2 ? num3 : num2;
		*/
	}
}
