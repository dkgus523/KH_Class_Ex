package Project01;

import java.util.Scanner;

/*9. while문 사용하기(학생 점수의 합계가 100점 이상이면 반복문 빠져나오기)
 * 8번에서 작성한 소스코드를 활용하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점), 입력된 점수는 50점 이상으로 가정한다.
 * 출력 : 입력된 성적(점수)의 총 합계가 100점 이상이면 반복문을 빠져나온다.
 * 마지막 "프로그램이 종료되었다"는 안내메시지를 띄운다.
 * 학습정보 : break 사용하기
 */
public class Pro09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] student = new String[3];
		int[] num = new int[3];
		
		int i =0;
		int hap = 0;
		while(true) {
			for(i=0; i<3; i++) {
				System.out.print("학생 " + (i+1) + "의 이름을 입력하세요 >>");
				student[i] = scan.next();
				System.out.print("학생 " + (i+1) + "의 성적을 입력하세요 >>");
				num[i] = scan.nextInt();
				hap = hap + num[i];
				
				// 입력된 점수는 50점 이상으로 가정한다.
				if(num[i] < 50) {
					System.out.print("학생 " + (i+1) + "의 성적을 다시 입력하세요 >>");
					num[i] = scan.nextInt();
					num[i]--;
				}
				
				if(hap >= 100) {
					break;
				}
			}
			break;
		}
		System.out.println("성적의 합계가 100점이 넘습니다.");
		System.out.println("프로그램이 종료되었습니다.");
		
	}
}

