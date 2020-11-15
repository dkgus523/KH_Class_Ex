package Project02;

import java.util.Scanner;


public class Grade {
	
	static String student ; //학생 이름
	static int num ;//학생 점수
	static int i=0;
	
	static void input() {
		Scanner scan = new Scanner(System.in);
		
		//String[] student = new String[3];
		//int[] num = new int[3];
		
		System.out.print("학생 " + (i+1) + "의 이름을 입력하세요 >>");
		student = scan.next();
		System.out.print("학생 " + (i+1) + "의 성적을 입력하세요 >>");
		num = scan.nextInt();
		i++;
			
		output();
		
	}
	static void output() {
		System.out.println("학생 " + (i+1) + "정보 : " + student + " " + num );
	}
	
}
