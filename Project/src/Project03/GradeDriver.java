package Project03;

import java.util.Scanner;

public class GradeDriver{

	static void input(){
		Grade g = new Grade();
		Scanner scan = new Scanner(System.in);

		System.out.print("학생 " + (g.i+1) + "의 이름을 입력하세요 >>");
		g.student = scan.next();
		System.out.print("학생 " + (g.i+1) + "의 성적을 입력하세요 >>");
		g.num = scan.nextInt();
		g.i++;
		
		System.out.println("학생 " + (g.i+1) + "정보 : " + g.student + " " + g.num );
		g.i++;
	}
}


