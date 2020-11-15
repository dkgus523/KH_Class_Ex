package Project01;

import java.util.Scanner;

/*8. 1차원 배열을 활용한 성적 출력 프로그램 작성하기
 * 1번에서 작성한 소스코드를 1차원 배열 형태로 변경하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점), 중복값은 없는 걸로 가정한다.
 * 출력 : 입력된 성적(점수)을 for문을 사용하여 출력하시오.
 * 학습정보 : 1차원 배열 사용하기
 */
public class Pro08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] student = new String[3];
		int[] num = new int[3];
		
		int i =0;
		for(i=0; i<3; i++) {
			System.out.print("학생 " + (i+1) + "의 이름을 입력하세요 >>");
			student[i] = scan.next();
			System.out.print("학생 " + (i+1) + "의 성적을 입력하세요 >>");
			num[i] = scan.nextInt();
		}
		
		for(i=0; i<3; i++) {
			System.out.println("학생 " + (i+1) + "정보 : " + student[i] + " " + num[i] );
		}
	}

}
