package Project01;

import java.util.Scanner;

/*1. 3명의 학생정보 입출력 시스템을 완성하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점) 
 * 출력 : 입력된 정보 출력 
 * 학습정보 : 대입연산자, 변수, 출력
 */
public class Pro01 {

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
		
		//if(num1 > 100 || num1 > 100 || num1 > 100 )
		//	System.out.println("성적은 100점 만점입니다. 다시 입력해주세요.");
		
		System.out.println("학생1 정보 : " + student1 + " " + num1 );
		System.out.println("학생2 정보 : " + student2 + " " + num2 );
		System.out.println("학생3 정보 : " + student3 + " " + num3 );
		
	}
}