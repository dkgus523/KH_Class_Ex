package Project01;

import java.util.Scanner;

public class Pro09_other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String student ;
		
		int num = 0, i =0, hap=0;

		while(hap < 100) {
				System.out.print("학생 " + (i+1) + "의 이름을 입력하세요 >>");
				student = scan.next();
				System.out.print("학생 " + (i+1) + "의 성적을 입력하세요 >>");
				num = scan.nextInt();
			}
			hap = hap + num;		
		
		//마지막 "프로그램이 종료되었다"는 안내메시지를 띄운다.
		System.out.println("프로그램이 종료되었습니다.");
	}
}


